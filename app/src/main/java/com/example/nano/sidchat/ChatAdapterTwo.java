package com.example.nano.sidchat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapterTwo extends ArrayAdapter<Chat> {

    private Context mContext;
    private List<Chat> moviesList = new ArrayList<>();

    public ChatAdapterTwo(spinner spinner, ArrayList<Chat> List) {
        super(spinner,0, List);
        mContext = spinner;
        moviesList = List;
    }

    /*public ChatAdapterTwo(@NonNull Context context, ArrayList<Chat> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }*/

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(com.example.nano.sidchat.R.layout.list_item2,parent,false);

       Chat currentMovie = moviesList.get(position);

        ImageView image = (ImageView)listItem.findViewById(com.example.nano.sidchat.R.id.imageView_poster);
        image.setImageResource(currentMovie.getmImageDrawable());

        TextView name = (TextView) listItem.findViewById(com.example.nano.sidchat.R.id.textView_name);
        name.setText(currentMovie.getmName());

        TextView release = (TextView) listItem.findViewById(com.example.nano.sidchat.R.id.textView_release);
        release.setText(currentMovie.getmRelease());

        TextView year = (TextView) listItem.findViewById(com.example.nano.sidchat.R.id.year);
        year.setText(currentMovie.getmReleaseyear());

        return listItem;
    }
}
