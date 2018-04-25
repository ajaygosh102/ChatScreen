package com.example.nano.sidchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.nano.sidchat.chatscreen.chatactivity;

public class frontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
    }

    public void chattab(View view) {
        Intent intent = new Intent(frontActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void spinnar(View view) {

        Intent intent = new Intent(frontActivity.this,spinner.class);
        startActivity(intent);
    }

    public void chat(View view) {
        Intent intent = new Intent(frontActivity.this,chatactivity.class);
        startActivity(intent);
    }
}
