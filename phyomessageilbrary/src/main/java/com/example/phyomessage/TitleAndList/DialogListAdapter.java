package com.example.phyomessage.TitleAndList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phyomessage.R;

import java.util.List;

public class DialogListAdapter extends RecyclerView.Adapter {
    Context context;
    List<String> listItems;
    public DialogListAdapter(Context context, List<String> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListItemViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ListItemViewHolder) {
            ((ListItemViewHolder) holder).itemName.setText(listItems.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    private class ListItemViewHolder extends RecyclerView.ViewHolder {

        TextView itemName;
        public ListItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.list_item_name);
        }
    }
}
