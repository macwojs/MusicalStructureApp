package com.example.macwojs.musicalstructureapp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        String title = getIntent().getStringExtra("title");
        String artist = getIntent().getStringExtra("artist");
        Integer src = getIntent().getIntExtra("src",0);

        TextView titleTextView = (TextView) findViewById(R.id.title_text_view);
        titleTextView.setText(title);

        TextView artistTextView = (TextView) findViewById(R.id.artist_text_view);
        artistTextView.setText(artist);

        ImageView coverImageView = (ImageView) findViewById(R.id.cover_image_view);
        coverImageView.setImageResource(src);

        ImageView button = (ImageView) findViewById(R.id.play_button);

        // Set a click listener on that View

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ImageView imageView = (ImageView) findViewById(R.id.play_button);
                if(imageView.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.ic_play).getConstantState()){
                    imageView.setImageResource(R.drawable.ic_pause);
                } else{
                    imageView.setImageResource(R.drawable.ic_play);
                }

            }
        });
    }
}
