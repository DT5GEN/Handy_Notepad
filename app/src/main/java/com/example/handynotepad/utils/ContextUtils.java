package com.example.handynotepad.utils;

import android.content.Context;

import com.example.handynotepad.App;

public class ContextUtils {
    public static App getApp(Context context) {
        return (App) context.getApplicationContext();
    }
}