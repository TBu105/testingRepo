package com.example.historyview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

    Context context;
    ArrayList<HistoryClass> historyArrLs;

    public HistoryAdapter(Context context, ArrayList<HistoryClass> historyArrLs) {
        this.context = context;
        this.historyArrLs = historyArrLs;
    }

    @NonNull
    @Override
    public HistoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_recyclerview_history, parent, false);

        return new HistoryAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.MyViewHolder holder, int position) {
        holder.txtJamName.setText(historyArrLs.get(position).getTxtJamName());
        holder.txtLostMoney.setText(historyArrLs.get(position).getTxtLostMoney());
        holder.txtMinuteAgo.setText(historyArrLs.get(position).getTxtMinuteAgo());
        holder.imgAva.setImageResource(historyArrLs.get(position).getImgAva());
    }

    @Override
    public int getItemCount() {
        return historyArrLs.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgAva;
        TextView txtLostMoney, txtJamName, txtMinuteAgo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgAva = itemView.findViewById(R.id.imgAva);
            txtJamName = itemView.findViewById(R.id.txtJamName);
            txtLostMoney = itemView.findViewById(R.id.txtLostMoney);
            txtMinuteAgo = itemView.findViewById(R.id.txtMinuteAgo);

        }
    }
}
