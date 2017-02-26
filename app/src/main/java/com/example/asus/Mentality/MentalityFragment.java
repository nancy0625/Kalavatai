package com.example.asus.Mentality;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

//import com.example.asus.Mentality.database.MentalityDbSchema;

/**
 * Created by asus on 2017/1/19.
 */
public class MentalityFragment extends Fragment {
    private Mentality mMentality;
    private EditText mTitleField;
    private EditText mTitleField1;
//    private Button PhotoButton;
//    private Button mButton;



    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
//        mkalavatai = new Mentality(UUID.fromString(uuidString));

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savesInstanceState){
        View v = inflater.inflate(R.layout.fragment_mentality,container,false);

////        PackageManager packageManager = getActivity().getPackageManager();
////        if (packageManager.resolveActivity(packageManager,PackageManager.MATCH_DEFAULT_ONLY) == null)
////
//
//        mTitleField = (EditText)v.findViewById(R.id.mentality_title);
//        mTitleField.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                     mMentality.setTitle(s.toString());
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        mTitleField1 = (EditText)v.findViewById(R.id.mentality_content);
//        mTitleField1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                mMentality.setmD(s.toString());
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
        return v;
    }
}
