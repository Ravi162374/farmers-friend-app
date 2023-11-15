package com.example.farmerapp;

import android.content.SharedPreferences;

public class LanguagePreference {
    private static final String PREF_NAME = "LanguagePreference";
    private static final String KEY_LANGUAGE = "selectedLanguage";

    public static void setSelectedLanguage(SharedPreferences sharedPreferences, String language) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_LANGUAGE, language);
        editor.apply();
    }

    public static String getSelectedLanguage(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(KEY_LANGUAGE, "");
    }
}
