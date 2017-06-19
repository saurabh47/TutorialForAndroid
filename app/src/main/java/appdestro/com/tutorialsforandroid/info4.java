package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class info4 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info4);
        TextView t1=(TextView)findViewById(R.id.info4);
        t1.setText("public class MainActivity extends AppCompatActivity {\n" +
                "    Button get, clear, src;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        get = (Button) findViewById(R.id.n1);\n" +
                "        clear = (Button) findViewById(R.id.nc1);\n" +
                "        src = (Button) findViewById(R.id.source4);\n" +
                "\n" +
                "\n" +
                "        get.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "Notification();\n" +
                "            }\n" +
                "        });\n" +
                "        clear.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "cancle();\n" +
                "            }\n" +
                "        });\n" +
                "        src.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "    public void Notification() {\n" +
                "\n" +
                "        Intent intent = new Intent(this, message.class);\n" +
                "        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);\n" +

                "        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)\n" +
                "                .setSmallIcon(R.drawable.ic_launcher_round)\n" +
                "                .setContentTitle(\"hello\")\n" +
                "                .setContentText(\"this\")\n" +
                "                .addAction(R.drawable.ic_launcher, \"Action Button\", pIntent)\n" +
                "                .setContentIntent(pIntent)\n" +
                "                .setAutoCancel(true);\n" +
                "        NotificationManager notificationmanager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);\n" +
                "        notificationmanager.notify(0, builder.build());\n" +

                "    }\n" +
                "\n" +
                "public  void cancle()\n" +
                "{\n" +
                "    NotificationManager notifManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);\n" +
                "    notifManager.cancelAll();\n" +
                "}\n" +
                "\n" +
                "}");
    }
}
