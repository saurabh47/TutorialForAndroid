package appdestro.com.tutorialsforandroid;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class first extends AppCompatActivity {

    Button b1,b2;
    TextView t1;
    Animation a1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        b1=(Button)findViewById(R.id.buttonS);
        b2=(Button)findViewById(R.id.buttonA);
        t1=(TextView)findViewById(R.id.textViewA);
        a1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i1 = new Intent(getApplicationContext(), tab0.class);
                startActivity(i1);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(a1);
            }
        });


    }
}
