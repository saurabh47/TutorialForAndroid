package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class sixth_info extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_info);
        t1=(TextView)findViewById(R.id.sixth_info6);

        t1.setText("1.MainActivity" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "Button exp,imp,src;\n" +
                "    @Override\n" +
                "    protected void onCreate( Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        exp=(Button)findViewById(R.id.exp);\n" +
                "        imp=(Button)findViewById(R.id.imp);\n" +
                "        src=(Button)findViewById(R.id.source7);\n" +
                "\n" +
                "// Expilcit Intent" +
                "\n" +
                "        imp.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                Intent i1=new Intent(getApplicationContext(),sixth_61.class);\n" +
                "                startActivity(i1);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}" +
                "\n" +
                "\n" +
                "2.sixth_61.class" +
                "\n" +
                "\n" +
                "public class sixth_61 extends AppCompatActivity {\n" +
                "    @Override\n" +
                "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        TextView tv=new TextView(this);\n" +
                "        tv.setText(\"Hello ! this is explicit Intent\");\n" +
                "        tv.setTextSize(20);\n" +
                "        setContentView(tv);\n" +
                "    }\n" +
                "}" +
                "\n" +
                "\n" +
                "3.AndroidManifest" +
                "\n" +
                "\n" +
                "<activity  android:name=\".sixth_61>\"" +


                " <intent-filter>\n" +
                        "  <action android:name=\"appdestro.com.TutorialForAndroid.sixth_61\"/>\n" +
                        "\n" +
                        "<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                        "   /intent-filter>\n" +

                " </activity>\n" +
                "\n" +
                "\n" +
                "4.step" +
                "\n" +
                "\n" +
                "create a second app in that app use the below line as intent argument" +
                "\n" +
                "appdestro.com.TutorialForAndroid.sixth_61" +
                ""+

                "");

    }
}
