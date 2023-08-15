package com.churchapplication.testapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.RemoteMessage;

public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {

    private static final String TAG = "FirebaseMsgService";
    private String msg,title;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.e(TAG,"onMessageReceived");
        title = remoteMessage.getNotification().getTitle();
        msg = remoteMessage.getNotification().getBody();
        Intent intent = new Intent(this,yschmain.class);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,new Intent(this, yschmain.class),0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.bibile).setContentTitle(title).setContentText(msg).setAutoCancel(true)
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setVibrate(new long[]{1,1000});
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,mBuilder.build());
        mBuilder.setContentIntent(contentIntent);
    }
}
