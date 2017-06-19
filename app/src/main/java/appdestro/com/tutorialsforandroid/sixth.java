package appdestro.com.tutorialsforandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class sixth extends AppCompatActivity {
Button exp,imp,src;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth);
        exp=(Button)findViewById(R.id.exp);
        imp=(Button)findViewById(R.id.imp);
        src=(Button)findViewById(R.id.source7);

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),sixth_61.class);
                startActivity(i1);
            }
        });
        imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i1=new Intent(getApplicationContext(),sixth_info.class);
                startActivity(i1);
            }
        });
        src.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),info6.class);
                startActivity(i1);
            }
        });
    }
}
