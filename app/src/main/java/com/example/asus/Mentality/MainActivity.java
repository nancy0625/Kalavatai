package com.example.asus.Mentality;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by asus on 2017/2/14.
 */
public class MainActivity extends FragmentActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button button1 = (Button) findViewById(R.id.main_tab_reservation);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MentalityActivity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.main_tab_book);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.main_tab_person);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PersonalActivity.class);
                startActivity(intent);
            }
        });
    }
}

//    private RadioButton btn1;
//    private RadioButton btn2;
//    private RadioButton btn3;
//    private RadioButton btn4;
//    private RadioGroup rGroup;
//
//
//    private MentalityFragment f1;
//    private  BookFragment f2;
//    private  ReadAssetFragment f3;
//    private FragmentManager manager;
//    private FragmentTransaction transaction;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_mentality);
//
//        //拿到事务管理器并开启事务
//
//        manager = getSupportFragmentManager();
//        transaction = manager.beginTransaction();
//        //初始化按钮
//        btn1 = (RadioButton) findViewById(R.id.main_tab_addExam);
//        btn2 = (RadioButton) findViewById(R.id.main_tab_reservation);
//        btn3 = (RadioButton) findViewById(R.id.main_tab_book);
//        btn4 = (RadioButton) findViewById(R.id.main_tab_person);
//
//        rGroup = (RadioGroup) findViewById(R.id.rg);
//
//        //为三个按钮添加监听器
//        btn1.setOnClickListener( this);
//        btn2.setOnClickListener( this);
//        btn3.setOnClickListener( this);
//        btn4.setOnClickListener( this);
//
//        //启动默认选中第一个
//
//        rGroup.check(R.id.main_tab_addExam);
//        f1  = new MentalityFragment();
//        transaction.replace(R.id.mentality_content,f1);
//        transaction.commit();
//
//    }
//
//    @Override
//    public void onClick(View v) {
//
//        manager = getSupportFragmentManager();
//        transaction = manager.beginTransaction();
//
//        switch (v.getId()){
//            case R.id.main_tab_addExam:
//                //为了防止重叠，需要点击之前先移除其他fragment
//                hideFragment(transaction);
//                f1 = new MentalityFragment();
//                transaction.replace(R.id.mentality_content,f1);
//                transaction.commit();
//
//                break;
//            case R.id.main_tab_reservation:
//                hideFragment(transaction);
//                f2 = new BookFragment();
//
//        }
//
//    }
//
//    private void hideFragment(FragmentTransaction transaction) {
//        if (f1 != null){
//            transaction.remove(f1);
//        }
////        if (f2 != null){
////            transaction.remove(f2);
////        }
////        if (f3 != null){
////            transaction.remove(f3);
////        }
//
//    }


