package com.example.neha.stock;


import java.net.URL;

public class Stock {
    private String mSubHeadingId;
    private String mHeadingId;
    private int mColorResourceId;


    public Stock(String headingId, String subHeadingId){
       mHeadingId=headingId;
       mSubHeadingId=subHeadingId;

    }

    public int getColorResourceId(){
        return mColorResourceId;
    }

    public String getHeadingId()
    {
        return mHeadingId;
    }
    public String getSubHeadingId(){
        return mSubHeadingId;
    }
}


