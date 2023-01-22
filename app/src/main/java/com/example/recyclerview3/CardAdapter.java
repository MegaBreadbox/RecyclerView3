package com.example.recyclerview3;

import android.content.Context;
import android.view.LayoutInflater;
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

    //This code onCreateViewHolder doesn't change much.
    @NonNull
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.entry_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, int position) {
        holder.txtTitle.setText(cards.get(position).getNumberString());
        holder.txtDesc.setText(cards.get(position).getIdentityString());
    }

    public void setupCards(ArrayList<List> cards){
        this.cards = cards;
        notifyDataSetChanged();

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
