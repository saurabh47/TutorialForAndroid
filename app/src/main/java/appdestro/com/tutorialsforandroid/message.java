package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class message extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv=new TextView(this);
        tv.setText("This from floating button ," +
                "hey:)");
        tv.setTextSize(20);
        setContentView(tv);
    }
}
