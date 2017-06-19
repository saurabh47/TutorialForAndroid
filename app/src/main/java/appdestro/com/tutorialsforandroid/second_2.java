package appdestro.com.tutorialsforandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class second_2 extends AppCompatActivity {
    Button get,src;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_2);
get=(Button)findViewById(R.id.Get);

        src=(Button)findViewById(R.id.source1);



        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ad=new AlertDialog.Builder(second_2.this);
                ad.setTitle("Example");
                ad.setMessage("Do you want to exit").setCancelable(false);
                AlertDialog.Builder yes = ad.setPositiveButton("yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        second_2.this.finish();
                    }
                })
                        .setNegativeButton("no",new DialogInterface.OnClickListener()
                        {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog ad1= ad.create();
                ad1.show();
            }
        });


        src.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),second_21.class);
                startActivity(i1);
            }
        });


    }

}
