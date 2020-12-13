package com.diogo.diogoqueiroz_lucasbittencourt_comp304lab5;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TypesAdapter extends RecyclerView.Adapter<TypesAdapter.MyViewHolder>
{
    private Context context;
    private String[] types;
    private SharedPreferences sharedPreferences;

    public TypesAdapter(Context context, String[] types)
    {
        this.context = context;
        this.types = types;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView type;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            type = itemView.findViewById(R.id.recycler_item_name);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = new View(context);
        listItem = inflater.inflate(R.layout.recycler_item_types, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        holder.type.setText(types[position]);
    }

    @Override
    public int getItemCount()
    {
        return types.length;
    }
}
