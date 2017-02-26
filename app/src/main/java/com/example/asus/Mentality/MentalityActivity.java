package com.example.asus.Mentality;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MentalityActivity extends FragmentActivity  {
//    EditText text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentality);

//        Button button1 = (Button) findViewById(R.id.main_tab_reservation);
//        button1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(MentalityActivity.this,MentalityActivity.class);
//                startActivity(intent);
//            }
//        });


        Button button = (Button) findViewById(R.id.mentality_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MentalityActivity.this,"您好，预约成功了！",Toast.LENGTH_SHORT).show();
            }
        });
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new MentalityFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }


//    public CharSequence getSavedText(){
//        return ((TextView)findViewById(R.id.main_tab_reservation)).getText();
//    }
//    public void setSavedText(CharSequence text){
//        ((TextView)findViewById(R.id.main_tab_reservation)).setText(text);
//    }

//    public void load(){
//        try {
//            FileInputStream inStream=this.openFileInput("a.txt");
//            ByteArrayOutputStream stream=new ByteArrayOutputStream();
//            byte[] buffer=new byte[1024];
//            int length=-1;
//            while((length=inStream.read(buffer))!=-1) {
//                stream.write(buffer,0,length);
//            }
//            stream.close();
//            inStream.close();
//            text.setText(stream.toString());
//            Toast.makeText(MentalityActivity.this,"Loaded",Toast.LENGTH_LONG).show();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e){
//            return ;
//        }
//    }

}
