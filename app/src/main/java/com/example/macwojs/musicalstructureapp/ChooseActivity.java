package com.example.macwojs.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Wish You Were Here", "Pink Floyd", R.drawable.p1));
        musics.add(new Music("Why Can't I Change", "Passenger", R.drawable.p2));
        musics.add(new Music("Perfect", "Ed Sheran", R.drawable.p3));
        musics.add(new Music("Little Plastic Castle", "Ani DiFranco", R.drawable.p4));
        musics.add(new Music("Legendary", "Welshly Arms", R.drawable.p5));
        musics.add(new Music("House Of The Rising Sun", "The Animals", R.drawable.p6));
        musics.add(new Music("40:1", "Sabaton", R.drawable.p7));
        musics.add(new Music("Wind Of Change", "Scorpions", R.drawable.p8));

        MusicAdapter adapter = new MusicAdapter(this, musics);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent playerActivity = new Intent(ChooseActivity.this, PlayerActivity.class);

                playerActivity.putExtra("title",musics.get(position).getmTitle());
                playerActivity.putExtra("artist",musics.get(position).getmArtist());
                playerActivity.putExtra("src",musics.get(position).getmSrc());

                startActivity(playerActivity);
            }
        });



    }
}
