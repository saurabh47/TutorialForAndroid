package appdestro.com.tutorialsforandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by PRATHAMESH on 16-Jun-17.
 */

public class fifth_51 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Got The Custom Intent", Toast.LENGTH_LONG).show();
    }
}

