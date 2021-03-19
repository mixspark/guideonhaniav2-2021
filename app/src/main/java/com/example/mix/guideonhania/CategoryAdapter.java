package com.example.mix.guideonhania;

import android.support.annotation.Nullable;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param mainActivity
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HaniaFragment();
        } else if (position == 1) {
            return new OldTownFragment();
        } else if (position == 2) {
            return new SightsFragment();
        } else if (position == 3) {
            return new BeachesFragment();
        } else {
            return new VillagesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_hania);
        } else if (position == 1) {
            return mContext.getString(R.string.category_oldTown);
        } else if (position == 2) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 3) {
            return mContext.getString(R.string.category_beaches);
        } else {
            return mContext.getString(R.string.category_villages);
        }
    }
}