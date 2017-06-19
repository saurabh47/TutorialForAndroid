package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by PRATHAMESH on 17-Jun-17.
 */

public class tab2 extends AppCompatActivity {

    private SectionsPagerAdapter1 mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2);

        mSectionsPagerAdapter = new SectionsPagerAdapter1(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }


    public class SectionsPagerAdapter1 extends FragmentPagerAdapter {
        public SectionsPagerAdapter1(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case  0:
                    data_21 d1=new data_21();
                    return d1;
                case  1:
                    data_22 d2=new data_22();
                    return d2;
            }
            return null;
        }


        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "MainActivity.java";
                case 1:
                    return "xml";
            }
            return null;
        }
    }
}