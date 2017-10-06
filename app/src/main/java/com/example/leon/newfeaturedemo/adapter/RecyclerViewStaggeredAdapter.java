package com.example.leon.newfeaturedemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.leon.newfeaturedemo.R;

import java.util.Random;

/**
 * Created by Leon on 0006.
 */

public class RecyclerViewStaggeredAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;

    public RecyclerViewStaggeredAdapter(Context context) {
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_staggered_item, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TextView tv = (TextView) holder.itemView.findViewById(R.id.tv);
        tv.setHeight(100 + new Random().nextInt(200));
        tv.setText("Hello World " + position);
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    private static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
