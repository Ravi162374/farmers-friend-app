package com.example.farmerapp;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class solidfertilizers extends AppCompatActivity {

    private VideoView videoView;
    private ProgressBar progressBar;

    private StorageReference storageReference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solidfertilizers);

        videoView = findViewById(R.id.videoView);
        progressBar = findViewById(R.id.progressBar);

        // Get a reference to the Firebase Storage
        storageReference = FirebaseStorage.getInstance().getReference();

        // Specify the path to your video file in Firebase Storage
        String videoPath = "videos.mp4"; // Replace with the actual path to your video in Firebase Storage

        // Set up a MediaController to control playback
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        // Retrieve the download URL for the video
        storageReference.child(videoPath).getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
            @Override
            public void onComplete(@NonNull Task<Uri> task) {
                if (task.isSuccessful()) {
                    Uri videoUri = task.getResult();
                    if (videoUri != null) {
                        // Set the video URI and start loading
                        videoView.setVideoURI(videoUri);
                        videoView.setOnPreparedListener(mp -> {
                            // Hide the progress bar once the video is loaded and ready to play
                            progressBar.setVisibility(View.GONE);
                            videoView.start();
                        });
                    } else {
                        // Handle the case when the video URI is null
                    }
                } else {
                    // Handle any errors that occurred while retrieving the download URL
                }
            }
        });
    }
}
