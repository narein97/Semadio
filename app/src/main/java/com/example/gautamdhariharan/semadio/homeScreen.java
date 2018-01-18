package com.example.gautamdhariharan.semadio;


import android.content.res.Configuration;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;



public class homeScreen extends AppCompatActivity {
    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle drawerToggle;


    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find our drawer view
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Find our drawer view
        nvDrawer = (NavigationView) findViewById(R.id.nvView);
        // Setup drawer view
        setupDrawerContent(nvDrawer);
        home_setup();
    }
    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }
    public void selectDrawerItem(MenuItem menuItem) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
        Fragment fragment = null;
        Class fragmentClass;
        switch(menuItem.getItemId()) {
            case R.id.home:
                fragmentClass = homeScreen.class;
                break;
            //case R.id.recent:
                //fragmentClass = recent.class;
                //break;
            case R.id.dashboard1:
                fragmentClass = uploaderDash.class;
                break;
            //case R.id.liked:
                //fragmentClass = liked.class;
                //break;
            //case R.id.settings:
                //fragmentClass=settings.class;
                //break;
            default:
                fragmentClass=homeScreen.class;
                break;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();

        // Highlight the selected item has been done by NavigationView
        menuItem.setChecked(true);
        // Set action bar title
        setTitle(menuItem.getTitle());
        // Close the navigation drawer
        mDrawer.closeDrawers();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    void home_setup(){
        ScreenParam sp = new ScreenParam();
        int width = sp.getScreenWidth(homeScreen.this);
        int height = sp.getScreenHeight(homeScreen.this);
        TextView text;
        int height_ad,height_vid;
        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            height_ad=(int)(height/2.5);
            height_vid=height/3;
            width= width*3/4;
        }
        else{
            height_ad= (int) (height/1.8);
            height_vid=(height/2);
            width=width*3/4;
        }
        ll=(LinearLayout)findViewById(R.id.adll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_ad);
        }
        ll=(LinearLayout)findViewById(R.id.engll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.hinll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.tamll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.mpll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        ll=(LinearLayout)findViewById(R.id.telll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
        }
        text = (TextView)findViewById(R.id.mostviewed);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.english);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.hindi);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.tamil);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.kannada);
        text.setHeight(height/5);
        text = (TextView)findViewById(R.id.uploaderD);
        text.setHeight(height/5);


    }

    public void click(View v){
        Intent i = new Intent(this,video.class);
        startActivity(i);
    }
    public void upd(View v){
        Intent i=new Intent(this, uploaderDash.class);
        startActivity(i);
    }


}
