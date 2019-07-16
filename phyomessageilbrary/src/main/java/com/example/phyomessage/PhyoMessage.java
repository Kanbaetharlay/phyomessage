package com.example.phyomessage;

import android.content.Context;
import android.widget.Toast;

public class PhyoMessage {
    public static void TitleAndMessage(Context context, String title, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void MessageOnly(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
