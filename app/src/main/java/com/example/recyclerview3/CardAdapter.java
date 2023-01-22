package com.example.recyclerview3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

   private ArrayList<List> cards = new ArrayList<>();
   private Context cContext;

    public CardAdapter(Context cContext) {
        this.cContext = cContext;
    }

    @NonNull
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    //Good practice in Java to make inner classes static.
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final CardView cardList;
        private final TextView txtTitle, txtDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardList = itemView.findViewById(R.id.cardList);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDesc = itemView.findViewById(R.id.txtDesc);

        }
    }
}
