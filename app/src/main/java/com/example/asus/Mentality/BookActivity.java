package com.example.asus.Mentality;

import android.app.Fragment;

/**
 * Created by asus on 2017/1/29.
 */
public class BookActivity extends SingleFragmentActivity{


    @Override
    protected Fragment createFragment(){
        return BookFragment.newInstance();
    }
}
