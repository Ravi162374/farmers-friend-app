package com.example.farmerapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NestedAdapter extends RecyclerView.Adapter<NestedAdapter.NestedViewHolder> {

    private List<String> mList;

    public NestedAdapter(List<String> mList){
        this.mList = mList;
    }
    @NonNull
    @Override
    public NestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item , parent , false);
        return new NestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedViewHolder holder, int position) {
        holder.mTv.setText(mList.get(position));
        holder.b1.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class NestedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTv;
        private Button b1;
        public Context context;
        public NestedViewHolder(@NonNull View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.nestedItemTv);
            b1 = (Button) itemView.findViewById(R.id.button);
            b1.setOnClickListener(this);
            context=itemView.getContext();
        }

        @Override
        public void onClick(View v) {
            String id=mTv.getText().toString();
            Intent intent = new Intent(context, solutiondecide.class);
            intent.putExtra("key", mTv.getText());
            context.startActivity(intent);

        }
    }
}