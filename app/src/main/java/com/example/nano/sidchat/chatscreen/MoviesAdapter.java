package com.example.nano.sidchat.chatscreen;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nano.sidchat.R;

import java.util.List;
import java.util.Random;

class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView message, time;

        public MyViewHolder(View view) {
            super(view);
            message = (TextView) view.findViewById(R.id.message);
            time = (TextView) view.findViewById(R.id.time);
        }
    }


    public MoviesAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
       // final int random=new Random().nextInt(61)+20;

        Random rand = new Random();
        int n = rand.nextInt(15);


        if((n%2)==0)
        itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_right, parent, false);
        else itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chatleft, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.message.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
