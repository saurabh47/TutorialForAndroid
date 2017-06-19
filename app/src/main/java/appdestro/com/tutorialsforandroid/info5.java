package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class info5 extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info5);
        TextView t1 = (TextView) findViewById(R.id.info5);

       t1.setText("/n" +
               "1.MainActivity" +
               "\n" +
               "\n" +
               "public class MainActivity extends AppCompatActivity {\n" +
               "    Button src,get;\n" +
               "    @Override\n" +
               "    protected void onCreate(Bundle savedInstanceState) {\n" +
               "        super.onCreate(savedInstanceState);\n" +
               "        setContentView(R.layout.activity_main);\n" +
               "src=(Button)findViewById(R.id.source5);\n" +
               "        get=(Button) findViewById(R.id.broad);\n" +
               "        src.setOnClickListener(new View.OnClickListener() {\n" +
               "            @Override\n" +
               "            public void onClick(View v) {\n" +
               "                Intent i1=new Intent(getApplicationContext(),info5.class);\n" +
               "                startActivity(i1);\n" +
               "            }\n" +
               "        });\n" +
               "\n" +
               "        get.setOnClickListener(new View.OnClickListener() {\n" +
               "            @Override\n" +
               "            public void onClick(View v) {\n" +
               "                broadcastIntent(v);\n" +
               "            }\n" +
               "        });\n" +
               "\n" +
               "\n" +
               "    }\n" +
               "    public void broadcastIntent(View  view){\n" +
               "        Intent intent = new Intent();\n" +
               "        intent.setAction(\"com.appdestro.customIntent\");\n" +
               "        sendBroadcast(intent);\n" +
               "\n" +
               "    }\n" +
               "}\n" +
               "\n" +
               "\n" +
               "2.BroadCastReceiver" +
               "\n" +
               "\n" +
               "public class fifth_51 extends BroadcastReceiver {\n" +
               "    @Override\n" +
               "    public void onReceive(Context context, Intent intent) {\n" +
               "        Toast.makeText(context, \"Got The Custom Intent\", Toast.LENGTH_LONG).show();\n" +
               "    }\n" +
               "}\n" +
               "\n" +
               "3.AndroidManifest" +
               "\n" +
               "\n" +
               "        <receiver android:name=\".fifth_51\">\n" +
               "            <intent-filter>\n" +
               "                <action android:name=\"com.appdestro.customIntent\">\n" +
               "                </action>\n" +
               "            </intent-filter>\n" +
               "\n" +
               "        </receiver>\n" +
               "\n" );

    }
}
