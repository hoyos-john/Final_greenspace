package com.example.greenspace;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroupsListAdapter extends RecyclerView.Adapter<GroupsListAdapter.ViewHolder> {

    Context context;
    ArrayList<Groups> groupsArrayList;
    public GroupsListAdapter(Context context, ArrayList<Groups> groupsArrayList) {
        this.context = context;
        this.groupsArrayList = groupsArrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtName.setText(groupsArrayList.get(position).getName());
        holder.titleImage.setImageResource(groupsArrayList.get(position).getTitleImage());
        holder.parent.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(context, groupsArrayList.get(position).getName() + "Selected: ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return groupsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtName;
        private CardView parent;
        private ImageView titleImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            parent = itemView.findViewById(R.id.parent);
            titleImage = itemView.findViewById(R.id.image);
        }
    }
}
