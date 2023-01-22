package com.example.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LookToListActivity extends AppCompatActivity {

    private RecyclerView CardRecView;
    private CardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_to_list);

        adapter = new CardAdapter(this);
        CardRecView = findViewById(R.id.cardRecView);

        CardRecView.setAdapter(adapter);
        CardRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<List> cards = new ArrayList<>();
        cards.add(new List(1234, 5329));
        cards.add(new List(1882, 5367));
        adapter.setupCards(cards);

    }



}