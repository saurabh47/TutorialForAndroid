package appdestro.com.tutorialsforandroid;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class tab0 extends AppCompatActivity {

    private SectionsPagerAdapter0 mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab0);

        mSectionsPagerAdapter = new SectionsPagerAdapter0(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }


    public class SectionsPagerAdapter0 extends FragmentPagerAdapter {
        public SectionsPagerAdapter0(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case  0:
                    data0 d1=new data0();
                    return d1;
                case  1:
                    data0_1 d2=new data0_1();
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