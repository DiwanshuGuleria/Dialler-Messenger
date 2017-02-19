package com.example.user.diallermessenger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_contact_adapter extends ArrayAdapter<String> {
    public custom_contact_adapter(Context context) {
        super(context, R.layout.contact_layout);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater SageInflator = LayoutInflater.from(getContext());
        View customView = SageInflator.inflate(R.layout.contact_layout,parent,false);

        TextView name_contact = (TextView) customView.findViewById(R.id.textView);
        ImageView image_contact = (ImageView) customView.findViewById(R.id.contact_image);


        return customView;


    }
}
