package com.example.hm3m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
    tvName = itemView.findViewById(R.id.text_view);
    }
   public void bind(String name){
        tvName.setText(name);

   }


}
