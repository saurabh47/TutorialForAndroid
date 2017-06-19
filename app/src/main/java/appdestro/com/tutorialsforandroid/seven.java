package appdestro.com.tutorialsforandroid;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by PRATHAMESH on 18-Jun-17.
 */

public class seven extends AppCompatActivity {

    Button start, src;
    AnimationDrawable frameAnimation;
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seven);
        start = (Button) findViewById(R.id.start);

        src = (Button) findViewById(R.id.source7p);





        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate();
            }
        });



        src.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),tab7.class);
                startActivity(i1);

            }
        });
    }

    private void animate() {
        ImageView imgView = (ImageView)findViewById(R.id.animationImage);

        imgView.setBackgroundResource(R.drawable.frame_animation);

        AnimationDrawable frameAnimation =
                (AnimationDrawable) imgView.getBackground();

        if (frameAnimation.isRunning()) {
            frameAnimation.stop();
        }
        else {
            //  frameAnimation.stop();
            frameAnimation.start();
        }
    }
}



