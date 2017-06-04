package com.example.user.cloudc;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Notificatiion extends AppCompatActivity {

    NotificationCompat.Builder notification;
    private static final int uniqueID = 45612;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificatiion);

        Button bn = (Button) findViewById(R.id.bn);
        textView = (TextView)findViewById(R.id.t2);

        notification = new NotificationCompat.Builder(Notificatiion.this);
        notification.setAutoCancel(true);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                notification.setSmallIcon(R.mipmap.ic_launcher);
                notification.setTicker("This is the ticker");
                notification.setWhen(System.currentTimeMillis());
                notification.setContentTitle("Here is the title");
                notification.setContentText("I m the  shivyank  text of your notification");
                Intent intent4 = new Intent(Notificatiion.this, MainActivity.class);
                startActivity(intent4);
                PendingIntent pendingIntent = PendingIntent.getActivity(Notificatiion.this, 0, intent4, PendingIntent.FLAG_UPDATE_CURRENT);
                notification.setContentIntent(pendingIntent);

//Builds notification and issues it
                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nm.notify(uniqueID, notification.build());
            }


        });
    }
}
