package com.example.heels;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAadpater extends RecyclerView.Adapter<ChildAadpater.ChildViewHolder> {

    List<ChildItems>childItemsList;
    Context context;
    String  category;

    public ChildAadpater(List<ChildItems> childItemsList,Context context,String category) {
        this.childItemsList = childItemsList;
        this.context=context;
        this.category=category;
    }
    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.child_layout,parent,false);
        return new ChildViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {
      var data=childItemsList.get(position);
      holder.textView.setText(data.getText());
      holder.imageView.setImageResource(data.getImageId());

      holder.itemView.setOnClickListener(v->{
          Intent intent=new Intent(context,DetailHeel.class);
          intent.putExtra("name",data.getText());
          intent.putExtra("image",data.getImageId());
          intent.putExtra("category",category);
          context.startActivity(intent);
      });
    }
    @Override
    public int getItemCount() {
        return childItemsList.size();
    }

    public static class ChildViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.childIv);
            textView=itemView.findViewById(R.id.childTv);
        }

    }

}
