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
 * Created by PRATHAMESH on 18-Jun-17.
 */

public class tab7 extends AppCompatActivity {
    private SectionsPagerAdapter7 mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override

    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab7);
        mSectionsPagerAdapter = new SectionsPagerAdapter7(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    public class SectionsPagerAdapter7 extends FragmentPagerAdapter {
        public SectionsPagerAdapter7(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case  0:
                    data7_1 d1=new data7_1();
                    return d1;
                case  1:
                    data7_2 d2=new data7_2();
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
                    return "frame_animation.xml";
            }
            return null;
        }
    }
}

