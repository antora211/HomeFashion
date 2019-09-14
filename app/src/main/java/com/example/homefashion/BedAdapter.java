package com.example.homefashion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BedAdapter extends RecyclerView.Adapter< BedAdapter.MyViewHolder> {

    Context context;
    ArrayList<BedProfile> profiles;

    public  BedAdapter(Context c , ArrayList<BedProfile> p)
    {
        context = c;
        profiles = p; }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id.setText(profiles.get(position).getId());
        holder.name.setText(profiles.get(position).getName());
        holder.prize.setText(profiles.get(position).getPrize().toString());
        Picasso.get().load(profiles.get(position).getUrl()).into(holder.profilePic);

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView id,name,prize;
        ImageView profilePic;

        public MyViewHolder(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.id);
            name = (TextView) itemView.findViewById(R.id.textViewName);
            prize = (TextView) itemView.findViewById(R.id.textViewTK);
            profilePic = (ImageView) itemView.findViewById(R.id.imageShow);
        }

    }
}
