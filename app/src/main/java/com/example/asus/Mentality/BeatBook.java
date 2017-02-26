package com.example.asus.Mentality;

import android.app.Activity;
import android.app.Fragment;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

//import com.example.asus.Mentality.database.MentalityBaseHelper;
//import com.example.asus.Mentality.database.MentalityDbSchema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/2/5.
 */
public class BeatBook extends FragmentActivity {
    private static final String TAG = "BeatBook";

    private static final String BOOK_FOLDER = "sample_books";
    private AssetManager mAssets;
    private List<Book> mBooks = new ArrayList<>();
//    private Context mContext;
//    private SQLiteDatabase mDatabase;



    public BeatBook(Context context){
        mAssets = context.getAssets();
//        mContext = context.getApplicationContext();
//        mDatabase = new MentalityBaseHelper(mContext).getWritableDatabase();

        loadBooks();
    }

    private void loadBooks(){

        String[] bookNames;
        try {
            bookNames = mAssets.list(BOOK_FOLDER);
            Log.i(TAG,"Found" + bookNames.length + "books");
        } catch (IOException ioe){
            Log.e(TAG,"Could not list assets", ioe);
            return;
        }
        for (String filename : bookNames){
            String assetPath = BOOK_FOLDER+ "/" +filename;
            Book book = new Book(assetPath);
            mBooks.add(book);
        }
    }

    public List<Book> getBooks(){
        return mBooks;
    }
//    private static ContentValues getContentValues(Mentality mentality){
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(MentalityDbSchema.MentalityTable.CoIs.UUID,mentality.getId().toString());
//        contentValues.put(MentalityDbSchema.MentalityTable.CoIs.TITLE,mentality.getTitle());
//        return contentValues;
//    }
//    public void updateMentality(Mentality mentality){
//        String uuidString = mentality.getId().toString();
//        ContentValues contentValues = getContentValues(mentality);
//        mDatabase.update(MentalityDbSchema.MentalityTable.NAME,contentValues, MentalityDbSchema.MentalityTable.CoIs.UUID + "=?",new String[]{uuidString});
//    }



}
