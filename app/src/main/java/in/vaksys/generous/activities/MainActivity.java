package in.vaksys.generous.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import in.vaksys.generous.R;
import in.vaksys.generous.fragments.CampaignFragment;
import in.vaksys.generous.fragments.FoundationFragment;
import in.vaksys.generous.fragments.MonitoringDonationFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    //final ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
    private Toolbar toolbar;
    private ImageView toolImage;

    SmartTabLayout viewPagerTab;


    //TABS
    private TextView one, two, three, oneOne, twoTwo, threeThree;

    private FragmentManager fragmentManager;
    private CampaignFragment campaignFragment;
    private MonitoringDonationFragment monitoringDonationFragment;
    private FoundationFragment foundationFragment;

    public Context context;
    public String[] tabTitles = {"Campaign", "Monitoring Donation", "Foundation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbarHome);
        toolImage = (ImageView) findViewById(R.id.toolImage);
        setSupportActionBar(toolbar);
        toolImage.setVisibility(View.VISIBLE);
        toolbar.setTitle("");

        fragmentManager = getSupportFragmentManager();

        one = (TextView) findViewById(R.id.tv_one_new);
        two = (TextView) findViewById(R.id.tv_two_new);
        three = (TextView) findViewById(R.id.tv_three_new);

        oneOne = (TextView) findViewById(R.id.tv_one_one);
        twoTwo = (TextView) findViewById(R.id.tv_two_two);
        threeThree = (TextView) findViewById(R.id.tv_three_three);

        oneOne.setVisibility(View.VISIBLE);
        twoTwo.setVisibility(View.GONE);
        threeThree.setVisibility(View.GONE);


        campaignFragment = CampaignFragment.newInstance(0);
        monitoringDonationFragment = MonitoringDonationFragment.newInstance(1);
        foundationFragment = FoundationFragment.newInstance(2);
        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, campaignFragment)
                .commit();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .replace(R.id.fragment_container, campaignFragment)
                        .commit();
                oneOne.setVisibility(View.VISIBLE);
                twoTwo.setVisibility(View.GONE);
                threeThree.setVisibility(View.GONE);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .replace(R.id.fragment_container, monitoringDonationFragment)
                        .commit();
                oneOne.setVisibility(View.GONE);
                twoTwo.setVisibility(View.VISIBLE);
                threeThree.setVisibility(View.GONE);
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, foundationFragment)
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .commit();
                oneOne.setVisibility(View.GONE);
                twoTwo.setVisibility(View.GONE);
                threeThree.setVisibility(View.VISIBLE);
            }
        });

       /* getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/


        //viewPager = (ViewPager) findViewById(R.id.viewpager);
        //setupViewPager(viewPager);

        //tabLayout = (TabLayout) findViewById(R.id.tabs);
        //tabLayout.setupWithViewPager(viewPager);

        /*FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Campaign", CampaignFragment.class)
                .add("Monitoring Donation", MonitoringDonationFragment.class)
                .add("Foundation", FoundationFragment.class)
                .create());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpagerMain);
        viewPager.setAdapter(adapter);

        viewPagerTab = (SmartTabLayout) findViewById(R.id.tabsMain);
        //viewPagerTab.setCustomTabView(R.layout.one, R.id.tv_title_tool);
        viewPagerTab.setViewPager(viewPager);*/

//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                if (position == 0) {
//                    viewPagerTab.setBackgroundResource(R.drawable.ractangle_border);
//                }
//
//                if (position == 1) {
//                    viewPagerTab.setBackgroundResource(R.drawable.ractangle_border);
//                }
//
//                if (position == 2) {
//                    viewPagerTab.setBackgroundResource(R.drawable.ractangle_border);
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });

    }

//    private void setupViewPager(ViewPager viewPager) {
//
//        adapter.addFragment(new CampaignFragment(), "Campaign");
//        adapter.addFragment(new MonitoringDonationFragment(), "Monitoring Donation");
//        adapter.addFragment(new FoundationFragment(), "Foundation");
//        viewPager.setAdapter(adapter);
//    }
//
//    class ViewPagerAdapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//
//       /* public View getTabView(int position) {
//            // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView
//            View v = LayoutInflater.from(context).inflate(R.layout.custom_tab_view, null);
//            TextView tv = (TextView) v.findViewById(R.id.tv_title_tool);
//            tv.setText(tabTitles[position]);
//            return v;
//        }*/
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                finish();
                break;

            case R.id.action_map:
                startActivity(new Intent(MainActivity.this, LocationActivity.class));
                finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
}









