package appdestro.com.tutorialsforandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class fifth extends AppCompatActivity {
    Button src,get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);
src=(Button)findViewById(R.id.source5);
        get=(Button) findViewById(R.id.broad);
        src.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),info5.class);
                startActivity(i1);
            }
        });

        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                broadcastIntent(v);
            }
        });


    }
    public void broadcastIntent(View  view){
        Intent intent = new Intent();
        intent.setAction("com.appdestro.customIntent");
        sendBroadcast(intent);

    }
}

