package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class info3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info3);
        TextView t1=(TextView)findViewById(R.id.floatinfo);

        t1.setText("public class MainActivity extends AppCompatActivity {\n" +

                "    private FloatingActionButton fab;\n" +
                "    @Override\n" +
                "    protected void onCreate( Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.third);\n" +
                "        b1=(Button)findViewById(R.id.buttonfloat);\n" +
                "\n" +
                "        fab = (FloatingActionButton) findViewById(R.id.fab);\n" +
                "        fab.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Intent intent = new Intent(getApplication(), message.class);\n" +
                "                startActivity(intent);\n" +
                "            }\n" +
                "        });" +
                ")");
    }
}
