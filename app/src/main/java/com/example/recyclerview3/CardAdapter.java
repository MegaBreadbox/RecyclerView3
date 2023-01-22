package com.example.recyclerview3;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

   private ArrayList<List> cards = new ArrayList<>();
   private Context cContext;

    public CardAdapter(Context cContext) {
        this.cContext = cContext;
    }

}
