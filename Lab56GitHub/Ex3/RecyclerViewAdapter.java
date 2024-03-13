package com.example.lab56ex3;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder> {
  private final ArrayList<Model> modelArrayList;
  public final Context context;

    public RecyclerViewAdapter(ArrayList<Model> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {


        Model model = modelArrayList.get(position);
        holder.profileLetter.setText(model.getProfileLetter().toString());
        holder.name.setText(model.getName());
        holder.number.setText(model.getNumber());
        holder.address.setText(model.getAddress());

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
    TextView profileLetter, name, number, address;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profileLetter = itemView.findViewById(R.id.profileLetter);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            address = itemView.findViewById(R.id.address);


        }
    }
}
