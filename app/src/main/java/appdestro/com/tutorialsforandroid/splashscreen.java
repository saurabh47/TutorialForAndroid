package appdestro.com.tutorialsforandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;


/**
 * Created by PRATHAMESH on 12-Jun-17.
 */

public class splashscreen extends AppCompatActivity {
    android.app.ActionBar a1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);

//a1=getActionBar();
 //       a1.hide();

       // getSupportActionBar().hide();



       // getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
       // getActionBar().hide();
        Thread myThread =new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
