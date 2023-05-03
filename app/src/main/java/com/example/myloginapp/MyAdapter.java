package com.example.myloginapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    Context context;
    ArrayList<Client> list;

    public MyAdapter(Context context, ArrayList<Client> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Client client = list.get(position);
        holder.Username.setText(client.getUsername());
        holder.Commande.setText(client.getCommande());
        holder.Phone.setText(client.getPhone());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Username, Commande, Phone;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);

               Username = itemView.findViewById(R.id.Username);
            Commande = itemView.findViewById(R.id.Commande);
             Phone = itemView.findViewById(R.id.Phone);
        }
    }
}
