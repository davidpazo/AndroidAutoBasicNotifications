package com.example.android.basicnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyMessageHeardReceiver extends BroadcastReceiver {
    public MyMessageHeardReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        int thisConversationId = intent.getIntExtra("conversation_id", -1);

        Log.d("BasicNotifications", "MyMessageHeardReceiver for conversation");
    }
}
