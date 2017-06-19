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
public class data0_1 extends Fragment {


    public data0_1() {
        // Required empty public constructor
    }
    TextView t11;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View m2=inflater.inflate(R.layout.fragment_data0_1, container, false);
        t11 = (TextView)m2.findViewById(R.id.code2);
        t11.setText("Create A folder in res directory." +
                "Create A xml file in that xml copy the below code" +
                "\n" +
                "\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "android:fillAfter=\"true\" >\n" +
                "    <translate\n" +
                "        android:duration=\"500\"\n" +
                "        android:fromXDelta=\"-100%\"\n" +
                "        android:toXDelta=\"0%\"\n" +
                "        >\n" +
                "        </translate>\n" +
                "\n" +
                "</set>");

        return m2;
    }

}
