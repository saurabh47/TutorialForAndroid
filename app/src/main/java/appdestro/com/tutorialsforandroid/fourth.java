package appdestro.com.tutorialsforandroid;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class fourth extends AppCompatActivity {
    Button get, clear, src;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        get = (Button) findViewById(R.id.n1);
        clear = (Button) findViewById(R.id.nc1);
        src = (Button) findViewById(R.id.source4);


        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Notification();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
cancle();
            }
        });
        src.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i1=new Intent(getApplicationContext(),info4.class);
                startActivity(i1);
            }
        });
    }
    public void Notification() {

        Intent intent = new Intent(this, message.class);



        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);


        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)

                .setSmallIcon(R.drawable.ic_launcher_round)

                .setContentTitle("hello")

                .setContentText("this")

                .addAction(R.drawable.ic_launcher, "Action Button", pIntent)

                .setContentIntent(pIntent)

                .setAutoCancel(true);


        NotificationManager notificationmanager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        notificationmanager.notify(0, builder.build());

    }

public  void cancle()
{
    NotificationManager notifManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    notifManager.cancelAll();
}

}




