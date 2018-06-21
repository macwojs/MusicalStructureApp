package com.example.macwojs.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Wish you were here", "Ed Sheran", R.drawable.p1));
        musics.add(new Music("Wish you were here", "Ed Sheran", R.drawable.p2));
        musics.add(new Music("Wish you were here", "Ed Sheran", R.drawable.p3));
        musics.add(new Music("Wish you were here", "Ed Sheran", R.drawable.p4));

        MusicAdapter adapter = new MusicAdapter(this, musics);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
