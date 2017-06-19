package appdestro.com.tutorialsforandroid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class data_21 extends Fragment {


    public data_21() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1= inflater.inflate(R.layout.fragment_data_21, container, false);
        TextView t1=(TextView)v1.findViewById(R.id.floatinfo);

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



    return v1;
    }


}
