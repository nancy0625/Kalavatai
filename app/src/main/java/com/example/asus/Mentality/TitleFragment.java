package com.example.asus.Mentality;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by asus on 2017/2/20.
 */
public class TitleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        //加载布局文件然后返回view，显示在Activity中
        View view = inflater.inflate(R.layout.main_activity,container,false);
        return view;
    }
}
