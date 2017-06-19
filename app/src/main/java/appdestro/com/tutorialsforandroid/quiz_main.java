package appdestro.com.tutorialsforandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

/**
 * Created by PRATHAMESH on 14-Jun-17.
 */

public class quiz_main extends AppCompatActivity {
    private AdView mAdView;
    public quizdata  q1=new quizdata();
    private TextView t1;
    private Button b1,b2,b3,b4;
    private int mquestionno=0;

    private String Answer;
boolean clicked=false;
    private int score=0;
View v;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        mAdView = (AdView) findViewById(R.id.subadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        t1 = (TextView) findViewById(R.id.textView1);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
       // r=new Random();
//updatescore(score);
        updatequestions();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText() == Answer) {
                    updatequestions();

                    score=score+1;
                    Toast.makeText(quiz_main.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                } else {
                    updatequestions();
                   // updatescore(score);
                                        Toast.makeText(quiz_main.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText() == Answer) {
                    updatequestions();
                  clicked=true;
                    score=score+1;
                    Toast.makeText(quiz_main.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                } else {
                    updatequestions();
//updatescore(score);
                    Toast.makeText(quiz_main.this, "Wrong Answer", Toast.LENGTH_SHORT).show();

                }
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText() == Answer) {
                    updatequestions();
                    score=score+1;

                    Toast.makeText(quiz_main.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                } else {
                    updatequestions();
                   // updatescore(score);
                    Toast.makeText(quiz_main.this, "Wrong Answer", Toast.LENGTH_SHORT).show();


                }
            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i1);
                setContentView(R.layout.activity_main);
            }
        });
        }




/*private void updatescore(int n)
{
    score=n;
}*/

    private  void updatequestions()
    {
        if (mquestionno < q1.getLength())
        {
            t1.setText(q1.getque(mquestionno));
            b1.setText(q1.getchoices1(mquestionno));
            b2.setText(q1.getchoices2(mquestionno));
            b3.setText(q1.getchoices3(mquestionno));
            Answer = q1.getcans(mquestionno);
            mquestionno++;

        }
        else if(mquestionno==q1.getLength()&&clicked==true)
        {
           score++;
            over();
        }
        else
        {
            over();
        }

    }





    private void over()
    {
        AlertDialog.Builder a2;
        a2 = new AlertDialog.Builder(quiz_main.this);

                a2.setMessage("Quiz Over! Your Score is "+  score   +"/"+q1.getLength())
                  .setCancelable(false)
                .setPositiveButton("start again",new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),quiz_main.class));
                            }


                        })
                .setNegativeButton("Exit",new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }


                });


        AlertDialog a1=a2.create();
        a1.show();;
    }
}
