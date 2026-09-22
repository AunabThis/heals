package com.example.heels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ParentAdapater extends RecyclerView.Adapter<ParentAdapater.ParentViewHolder> {
List<ParentItems>parentItemsList;
Context context;

    public ParentAdapater(List<ParentItems> parentItemsList,Context context) {

        this.parentItemsList = parentItemsList;
        this.context=context;
    }
    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_layout,null);
        return new ParentViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, int position) {
        ParentItems data=parentItemsList.get(position);
      holder.textView.setText(data.getText());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder.recyclerView.getContext(),LinearLayoutManager.HORIZONTAL,false));
        holder.recyclerView.setAdapter(new ChildAadpater(data.getChildItemsList(),context,data.getText()));

        }
        @Override
        public int getItemCount() {
        return parentItemsList.size();
    }
        public static  class ParentViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
       RecyclerView recyclerView;

        public ParentViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.parentTv);
            recyclerView=itemView.findViewById(R.id.rvParent);
        }
    }
}
