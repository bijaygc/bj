package com.example.bookappointment;

import androidx.annotation.NonNull;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;


    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }


    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DoctorFragment doctorFragment = new DoctorFragment();
                return doctorFragment;
            case 1:
                ClinicFragment clinicFragment = new ClinicFragment();
                return clinicFragment;
            case 2:
                FeedbackFragment feedbackFragment = new FeedbackFragment();
                return feedbackFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}



