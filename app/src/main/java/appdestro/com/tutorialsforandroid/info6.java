package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class info6 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info6);
        t1=(TextView)findViewById(R.id.info6);

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
                "        exp.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                Intent i1=new Intent(getApplicationContext(),sixth_61.class);\n" +
                "                startActivity(i1);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

    }
}
