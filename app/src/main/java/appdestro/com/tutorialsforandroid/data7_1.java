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
public class data7_1 extends Fragment {


    public data7_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_data7_1, container, false);

        TextView t1=(TextView)v.findViewById(R.id.text7_1);

        t1.setText("" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    Button start, src;\n" +
                "    AnimationDrawable frameAnimation;\n" +
                "    ImageView imgView;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        start = (Button) findViewById(R.id.start);\n" +
                "\n" +
                "        src = (Button) findViewById(R.id.source7);\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "        start.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                animate();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "\n" +
                "        src.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "    private void animate() {\n" +
                "        ImageView imgView = (ImageView)findViewById(R.id.animationImage);\n" +
                "\n" +
                "        imgView.setBackgroundResource(R.drawable.frame_animation);\n" +
                "\n" +
                "        AnimationDrawable frameAnimation =\n" +
                "                (AnimationDrawable) imgView.getBackground();\n" +
                "\n" +
                "        if (frameAnimation.isRunning()) {\n" +
                "            frameAnimation.stop();\n" +
                "        }\n" +
                "        else {\n" +
                "            //  frameAnimation.stop();\n" +
                "            frameAnimation.start();\n" +
                "        }\n" +
                "    }\n" +
                "}\n");

        return v;
    }

}
