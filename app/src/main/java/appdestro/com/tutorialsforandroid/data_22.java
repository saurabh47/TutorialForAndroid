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
public class data_22 extends Fragment {


    public data_22() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1= inflater.inflate(R.layout.fragment_data_22, container, false);

        TextView t1=(TextView)v1.findViewById(R.id.data22);
        t1.setText("Hello");

    return v1;
    }





}
