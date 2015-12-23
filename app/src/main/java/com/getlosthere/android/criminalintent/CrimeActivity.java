package com.getlosthere.android.criminalintent;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class CrimeActivity extends AppCompatActivity {
        //FragmentActivity {

    @TargetApi(11)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
//            ActionBar actionBar = getSupportActionBar();
//            if (actionBar != null) {
//                actionBar.setTitle(R.string.title_activity_crime);
//            }
//        }

        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }

}
