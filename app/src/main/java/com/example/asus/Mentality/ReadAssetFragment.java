package com.example.asus.Mentality;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by asus on 2017/2/8.
 */
public class ReadAssetFragment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_asset);

        try {
            //Return an AssetManager instance for your application's package
            InputStream is = getResources().getAssets().open("sample_books/index.txt");


            int size = is.available();


            //read the entire asset into a local byte buffer.
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            //convert the buffer into a string.
            String text = new String(buffer, "GB2312");


            //Finally stick the string into the text view.
            TextView tv = (TextView) findViewById(R.id.text);
            tv.setText(text);
        } catch (IOException e) {
            //should never happen!
            throw new RuntimeException(e);
        }

    }





    public String convertCodeAndGetText(String sample_books) {// 转码

        File file = new File(sample_books);
        BufferedReader reader;
        String text = "";
        try {
            InputStream in = getResources().getAssets().open("sample_books/index.txt");
            // FileReader f_reader = new FileReader(file);
            // BufferedReader reader = new BufferedReader(f_reader);
            FileInputStream fis = new FileInputStream(file);

            in.mark(4);
            byte[] first3bytes = new byte[3];
            in.read(first3bytes);//找到文档的前三个字节并自动判断文档类型。
            in.reset();

            if (first3bytes[0] == (byte) 0xEF && first3bytes[1] == (byte) 0xBB
                    && first3bytes[2] == (byte) 0xBF) {// utf-8

                reader = new BufferedReader(new InputStreamReader(in, "utf-8"));

            } else if (first3bytes[0] == (byte) 0xFF
                    && first3bytes[1] == (byte) 0xFE) {

                reader = new BufferedReader(
                        new InputStreamReader(in, "unicode"));
            } else if (first3bytes[0] == (byte) 0xFE
                    && first3bytes[1] == (byte) 0xFF) {

                reader = new BufferedReader(new InputStreamReader(in,
                        "utf-16be"));
            } else if (first3bytes[0] == (byte) 0xFF
                    && first3bytes[1] == (byte) 0xFF) {

                reader = new BufferedReader(new InputStreamReader(in,
                        "utf-16le"));
            } else {

                reader = new BufferedReader(new InputStreamReader(in, "GBK"));
            }
            String str = reader.readLine();

            while (str != null) {
                text = text + str + "/n";
                str = reader.readLine();

            }

            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}