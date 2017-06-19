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
public class data7_2 extends Fragment {


    public data7_2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_data7_2, container, false);
        TextView t1=(TextView)v.findViewById(R.id.text7_2);
        t1.setText("\n" +
                "\n" +
                "<animation-list xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "android:oneshot=\"false\">\n" +
                "   <item android:drawable=\"@drawable/d1\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d2\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d3\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d4\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d5\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d6\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d7\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d8\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d9\" android:duration=\"50\" />\n" +
                "   <item android:drawable=\"@drawable/d10\" android:duration=\"50\" />\n" +
                "</animation-list>\n" +
                "\n" +
                "\n");

        return  v;
    }

}
