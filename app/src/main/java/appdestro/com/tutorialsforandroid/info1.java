package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class info1 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        t1=(TextView)findViewById(R.id.info1);
        t1.setText(" 1.MainActivity.java " +
                "" +
                "\n" +
                "\n"+


                "public class first extends AppCompatActivity {\n" +
                "\n" +
                "    Button b1,b2;\n" +
                "    TextView t1;\n" +
                "    Animation a1;\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.first);\n" +
                "b1=(Button)findViewById(R.id.buttonS);\n" +
                "        b2=(Button)findViewById(R.id.buttonA);\n" +
                "        t1=(TextView)findViewById(R.id.textViewA);\n" +
                "        a1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);\n" +
                "\n" +
                "\n" +
                "        b1.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                Intent i1=new Intent(getApplicationContext(),my1.class);\n" +
                "                startActivity(i1);\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b2.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                t1.setVisibility(View.VISIBLE);\n" +
                "                t1.startAnimation(a1);\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}  " +
                "" +
                "" +
                "" +
                "" +
                "\n" +
                "\n" +
                "2.Create a folder in res directory & copy below code" +
                "" +
                "\n" +
                "\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "android:fillAfter=\"true\" >\n" +
                "    <translate\n" +
                "        android:duration=\"500\"\n" +
                "        android:fromXDelta=\"-100%\"\n" +
                "        android:toXDelta=\"0%\"\n" +
                "        >\n" +
                "        </translate>\n" +
                "\n" +
                "</set> ");


    }
}
