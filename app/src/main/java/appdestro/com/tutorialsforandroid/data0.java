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
public class data0 extends Fragment {


    public data0() {
        // Required empty public constructor
    }

    TextView t11;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View m1=inflater.inflate(R.layout.fragment_data0, container, false);




            t11 = (TextView) m1.findViewById(R.id.code1);
            t11.setText("  public class first extends AppCompatActivity {\n" +
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
                    "}   ");



        return  m1;
    }

}
