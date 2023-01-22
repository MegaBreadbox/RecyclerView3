package com.example.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LookToListActivity extends AppCompatActivity {

    private RecyclerView CardRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_to_list);

        CardRecView = findViewById(R.id.cardRecView);
        CardRecView.setLayoutManager(new LinearLayoutManager(this));

    }



}