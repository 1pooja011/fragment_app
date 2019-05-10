package com.example.frag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {
    private String[] Mydataset;

    public Myadapter(String[] mydataset){
        this.Mydataset = mydataset;
    }
    @NonNull
    @Override
    public Myadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int Viewtype) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent, false);
        MyViewHolder vh;
        vh = new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    holder.tt.setText(Mydataset[position]);
    }

    @Override
    public int getItemCount() {
        return Mydataset.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView tt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tt = (TextView) itemView.findViewById(R.id.tt);
        }
    }
}
