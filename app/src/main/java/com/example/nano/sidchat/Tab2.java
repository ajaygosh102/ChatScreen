package com.example.nano.sidchat;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Tab2 extends Fragment {

    private ListView listView;
    private ChatAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupTextDetails(view);

    }

    private void setupTextDetails(View view) {
        listView = (ListView)view.findViewById(R.id.movies_list);
        ArrayList<Chat> moviesList = new ArrayList<>();
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher" , "12:30 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:35 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:30 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:30 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:40 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:50 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:30 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:20 am"));
        moviesList.add(new Chat(R.mipmap.house_karakter, "Edward Livingston" , "Teacher", "12:11 am"));

        mAdapter = new ChatAdapter(getContext(),moviesList);

        listView.setAdapter(mAdapter);
    }

}