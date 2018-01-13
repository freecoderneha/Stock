package com.example.neha.stock;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StockAdapter extends ArrayAdapter<Stock>{
    public StockAdapter(Context context, ArrayList<Stock> stocks) {
        super(context,0,stocks);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        Stock currentStock = getItem(position);

        TextView headingTextView = (TextView) listItemView.findViewById(R.id.text1);
        headingTextView.setText(currentStock.getHeadingId());

        TextView subHeadingTextView = (TextView) listItemView.findViewById(R.id.text2);
        subHeadingTextView.setText(currentStock.getSubHeadingId());
if(position==0)
{
    headingTextView.setTextColor(getContext().getResources().getColor(R.color.color1));
}
        if(position==1)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color2));
        }
        if(position==2)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color3));
        }
        if(position==3)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color4));
        }
        if(position==4)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color5));
        }
        if(position==5)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color6));
        }
        if(position==6)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color7));
        }
        if(position==7)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color8));
        }
        if(position==8)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color9));
        }
        if(position==9)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color10));
        }
        if(position==10)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color11));
        }
        if(position==11)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color12));
        }
        if(position==12)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color13));
        }
        if(position==13)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color14));
        }
        if(position==14)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color15));
        }
        if(position==15)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color16));
        }
        if(position==16)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color17));
        }
        if(position==17)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color18));
        }
        if(position==18)
        {
            headingTextView.setTextColor(getContext().getResources().getColor(R.color.color19));
        }
        return listItemView;
    }
}
