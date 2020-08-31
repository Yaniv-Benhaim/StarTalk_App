package com.gamedev.startalktheapp.ui.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.gamedev.startalktheapp.R;
import com.gamedev.startalktheapp.models.User;


import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    ArrayList<User> userArrayList;


    public RecyclerViewAdapter(ArrayList<User> userArrayList) {

        this.userArrayList = userArrayList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2,parent,false);
        return new RecyclerViewViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        User user = userArrayList.get(position);
        RecyclerViewViewHolder viewHolder= (RecyclerViewViewHolder) holder;

        if(position == 0||position == 1||position == 2||position == 3||position == 4)
        {
            viewHolder.item2.setVisibility(View.INVISIBLE);
        } else

    {

        viewHolder.txtView_title.setText(user.getTitle());
        viewHolder.imgView_icon.setImageResource(R.drawable.neil);
    }
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView_icon;
        TextView txtView_title;
        ConstraintLayout item2;
        //TextView txtView_description;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView_icon = itemView.findViewById(R.id.imgView_icon2);
            txtView_title = itemView.findViewById(R.id.txtView_title2);
            //txtView_description = itemView.findViewById(R.id.txtView_description);
             item2 = itemView.findViewById(R.id.item_2_id);

        }
    }
}