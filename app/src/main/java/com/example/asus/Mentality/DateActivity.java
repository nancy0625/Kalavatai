package com.example.asus.Mentality;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.InputType;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by asus on 2017/2/21.
 */
public class DateActivity extends FragmentActivity {
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_activity);

        EditText editText = new EditText(this);
        editText.setInputType(InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        editText.setGravity(Gravity.TOP);
        editText.setSingleLine(false);
        editText.setHorizontallyScrolling(true);



    }
    @Override

    protected void onDestroy() {

        // TODO Auto-generated method stub

        super.onDestroy();

        WriteUserInfo();

    }

    private void  WriteUserInfo()

    {

        SharedPreferences userInfo = getSharedPreferences("user_info",0);

        SharedPreferences.Editor editor = userInfo.edit();

        EditText userName = (EditText)findViewById(R.id.textView4);

        editor.putString("username", userName.getText().toString());

        editor.commit();

    }
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
//            Toast.makeText(DateActivity.this,"Loaded",Toast.LENGTH_LONG).show();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e){
//            return ;
//        }
//    }
}
