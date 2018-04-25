package com.example.nano.sidchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class spinner extends AppCompatActivity  implements
        AdapterView.OnItemSelectedListener {

    private ListView listView;
    private ChatAdapterTwo mAdapter;

    String[] country = { "select items", "USA", "China", "Japan", "Other",  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        listView =(ListView) findViewById(R.id.movies_list);
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

        mAdapter = new ChatAdapterTwo(spinner.this,moviesList);

        listView.setAdapter(mAdapter);



        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),country[position] ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
