package com.example.asus.Mentality;

import java.util.UUID;

/**
 * Created by asus on 2017/1/19.
 */
public class Mentality {
    private String mD;
    private UUID mId;
    private String mTitle;
    public Mentality(UUID uuid){
        //创建唯一标识符
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }
    public String getmD(){
        return mD;
    }
    public void setmD(String D){
        mD = D;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        mTitle = Title;
    }

//    public String getPhotoFilename(){
//        return "IMG_" + getId().toString() + ".jpg";
//    }

    public void setId(UUID Id) {
        mId = Id;
    }
}
