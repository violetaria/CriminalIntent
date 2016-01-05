package com.getlosthere.android.criminalintent;

import android.app.Fragment;

/**
 * Created by violetaria on 1/4/16.
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
