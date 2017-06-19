package appdestro.com.tutorialsforandroid;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import static appdestro.com.tutorialsforandroid.R.id.moreapps;
import static appdestro.com.tutorialsforandroid.R.id.nav_share;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,AdapterView.OnItemClickListener {
    public ListView l1;
    TextView temp;

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        l1 = (ListView) findViewById(R.id.list1);

        // adapter1 = new ArrayAdapter<String>(this, R.layout.mylistview, Data);

        l1.setAdapter(new example(this));
        l1.setOnItemClickListener(this);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.admob_interstitial_id));

        AdRequest adRequest = new AdRequest.Builder()
                .build();

        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home)
        {


        }
        else if (id == R.id.quiz)
        {
            Intent i1 = new Intent(getApplicationContext(), quiz_main.class);

            startActivity(i1);


        }
        else if (id == nav_share) {

            try {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                String sAux = "\nLet me recommend you this application\n\n";
                sAux = sAux + "https://play.google.com/store/apps/details?id=appdestro.com.tutorialsforandroid";
                i.putExtra(Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(i, "choose one"));
            } catch (Exception e) {
                //e.toString();
            }
        }
            else if (id == moreapps)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=AppDestro"));
                startActivity(intent);
            }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        // TextView temp=(TextView)view;
        //Toast.makeText(getApplicationContext(),"you clicked"+i,Toast.LENGTH_SHORT).show();
        if(i==0)
        {
            Intent i1=new Intent(getApplicationContext(),first.class);
            startActivity(i1);
        }
        else if(i==1)
        {
            Intent i2=new Intent(getApplicationContext(),second_2.class);
            startActivity(i2);
        }
        else if(i==2)
        {
            Intent i3=new Intent(getApplicationContext(),third_3.class);
            startActivity(i3);
        }
        else  if(i==3)
        {
            Intent i4=new Intent(getApplicationContext(),fourth.class);
            startActivity(i4);
        }
        else  if(i==4)
        {
            Intent i5=new Intent(getApplicationContext(),fifth.class);
            startActivity(i5);
        }
        else  if(i==5)
        {
            Intent i6=new Intent(getApplicationContext(),sixth.class);
            startActivity(i6);
        }
        else if(i==6)
        {
            Intent i7=new Intent(getApplicationContext(),seven.class);
            startActivity(i7);
        }
    }


    class Singlerow
{
String titles;
    String descriptions;
    int images;
    Singlerow(String titles,String descriptions,int images)
    {
this.titles=titles;
        this.descriptions=descriptions;
        this.images=images;
    }
}

    class example extends BaseAdapter
    {
ArrayList<Singlerow>listt;
        Context context;

        example(Context c)
        {
            context=c;
            listt=new ArrayList<Singlerow>();
            Resources res=c.getResources();
            String[] titles=res.getStringArray(R.array.titles);
            String[] descriptions=res.getStringArray(R.array.descriptions);
            int[] images={R.drawable.android,R.drawable.information,R.drawable.message,R.drawable.notify,R.drawable.icons,R.drawable.ex,R.drawable.last};
            for(int i=0;i<7;i++)
            {
                listt.add(new Singlerow(titles[i],descriptions[i],images[i]));
            }
        }
        @Override
        public int getCount() {
            return listt.size();
        }

        @Override
        public Object getItem(int i) {
            return listt.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)

        {

            LayoutInflater li=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row=li.inflate(R.layout.mylistview,viewGroup,false);
            TextView titles=(TextView) row.findViewById(R.id.textView1);
            TextView descriptions=(TextView) row.findViewById(R.id.txtDescription);
            ImageView images=(ImageView)row.findViewById(R.id.imageView);


            Singlerow temp=listt.get(i);

            titles.setText(temp.titles);
           descriptions .setText(temp.descriptions);
            images.setImageResource(temp.images);


            return row;
        }
    }
}



