package com.example.exportjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private  final Context context;
    private final List<Object> listRecyclerItem;

    public RecyclerAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView age;
        private TextView hobby;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            age = (TextView)itemView.findViewById(R.id.age);
            hobby = (TextView)itemView.findViewById(R.id.hobby);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        switch (i){
            case TYPE:
            default:
                View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
                return new ItemViewHolder((layoutView));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);

        switch (viewType){
            case TYPE:
            default:
                ItemViewHolder itemViewHolder = (ItemViewHolder)holder;
                Bio bio = (Bio) listRecyclerItem.get(position);

                itemViewHolder.name.setText(bio.getName());
                itemViewHolder.age.setText(bio.getAge());
                itemViewHolder.hobby.setText(bio.getHobby());
        }
    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }
}
