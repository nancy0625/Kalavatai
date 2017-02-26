package com.example.asus.Mentality;

/**
 * Created by asus on 2017/2/5.
 */
public class Book {
    private String mAssetPath;
    private String mName;
    private Integer mBookId;

    public Book(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".txt","");

    }
    public String getAssetPath(){
        return mAssetPath;
    }
    public String getName(){
        return mName;
    }

    public Integer getBookId(){
        return mBookId;
    }

    public void setBookId(Integer bookId) {
        mBookId = bookId;
    }
}
