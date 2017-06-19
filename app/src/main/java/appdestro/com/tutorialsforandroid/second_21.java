package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class second_21 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_21);
        t1=(TextView)findViewById(R.id.alertinfo);
        t1.setText("public class MainActivity extends AppCompatActivity {\n" +
                "    Button get,src;\n" +
                "\n" +
                "    \n" +
                "    @Override\n" +
                "\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.second_2);\n" +
                "get=(Button)findViewById(R.id.Get);\n" +
                "\n" +
                "        src=(Button)findViewById(R.id.source1);\n" +
                "       \n" +
                "\n" +
                "\n" +
                "        get.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                AlertDialog.Builder ad=new AlertDialog.Builder(MainActivity.this);\n" +
                "                ad.setTitle(\"Example\");\n" +
                "                ad.setMessage(\"Do you want to exit\").setCancelable(false);\n" +
                "                AlertDialog.Builder yes = ad.setPositiveButton(\"yes\", new DialogInterface.OnClickListener() {\n" +
                "\n" +
                "                    @Override\n" +
                "                    public void onClick(DialogInterface dialog, int which) {\n" +
                "                        MainActivity.this.finish();\n" +
                "                    }\n" +
                "                })\n" +
                "                        .setNegativeButton(\"no\",new DialogInterface.OnClickListener()\n" +
                "                        {\n" +
                "\n" +
                "                            @Override\n" +
                "                            public void onClick(DialogInterface dialog, int which) {\n" +
                "                                dialog.cancel();\n" +
                "                            }\n" +
                "                        });\n" +
                "                AlertDialog ad1= ad.create();\n" +
                "                ad1.show();\n" +
                "            }\n" +
                "        });\n");

    }
}
