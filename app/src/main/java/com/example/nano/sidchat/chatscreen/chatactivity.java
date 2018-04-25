package com.example.nano.sidchat.chatscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ListView;


import com.example.nano.sidchat.R;

import java.util.ArrayList;
import java.util.List;

public class chatactivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatactivity);

        recyclerView = (RecyclerView) findViewById(R.id.chatscreen);

        mAdapter = new MoviesAdapter(movieList);

        recyclerView.setHasFixedSize(true);

        editText=(EditText) findViewById(R.id.messageEditText);
        editText.getBackground().clearColorFilter();
        // vertical RecyclerView
        // keep movie_list_row.xml width to `match_parent`
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        // horizontal RecyclerView
        // keep movie_list_row.xml width to `wrap_content`
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(mLayoutManager);

        // adding inbuilt divider line
       // recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, 0));

        // adding custom divider line with padding 16dp
        // recyclerView.addItemDecoration(new MyDividerItemDecoration(this, LinearLayoutManager.HORIZONTAL, 16));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData()
    {
        Movie movie = new Movie("hiiiiiiii", "12.30 am");
        movieList.add(movie);

    movie = new Movie("helloooooo", "12.30 am");
        movieList.add(movie);

    movie = new Movie("whattss up maan?", "12.30 am");
        movieList.add(movie);

    movie = new Movie("where are u have been?",  "12.30 am");
        movieList.add(movie);

        movie = new Movie("where are u have been last day?",  "12.30 am");
        movieList.add(movie);

        movie = new Movie("can we meet tonight?",  "12.30 am");
        movieList.add(movie);


    movie = new Movie("helloooooo esferr erfef", "12.30 am");
        movieList.add(movie);

    movie = new Movie("whattss up maanwewrwerr 3efesfe sfsf4e?", "12.30 am");
        movieList.add(movie);

    movie = new Movie("where are u have been?",  "12.30 am");
        movieList.add(movie);

        movie = new Movie("where are u have been last day awdawddw fwdewerrer eawdwd?",  "12.30 am");
        movieList.add(movie);

        movie = new Movie("can we meet tonightefe fweffwefewf wefwefwf ewfwefe?",  "12.30 am");
        movieList.add(movie);

    // notify adapter about data set changes
    // so that it will render the list with new data
        mAdapter.notifyDataSetChanged();
}



}
