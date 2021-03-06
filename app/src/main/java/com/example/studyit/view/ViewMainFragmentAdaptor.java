//@author Баландин, Дегтяникова
package com.example.studyit.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studyit.R;
import com.example.studyit.model.CTask;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewMainFragmentAdaptor extends RecyclerView.Adapter<ViewAdaptor.ViewHolder> {

private LayoutInflater inflater;
private List<CTask> tasks;
private Context context;

        ViewMainFragmentAdaptor(Context context, List<CTask> CTasks) {
        this.tasks = CTasks;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        }
    @Override
    public ViewAdaptor.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fragment_main, parent, false);
        return new ViewAdaptor.ViewHolder(view);
    }

    @Override
public void onBindViewHolder(ViewAdaptor.ViewHolder holder, final int position) {
        CTask CTask = tasks.get(position);
        holder.nameView.setText(CTask.getName());
        holder.disciplineView.setText(CTask.getDiscipline());
        //holder.status.setImageDrawable();

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Toast.makeText(context, tasks.get(position).getName() + " is clicked!", Toast.LENGTH_SHORT).show();
        }
        });
        }
@Override
public int getItemCount() {
        return tasks.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder {
    final TextView nameView;
    final TextView disciplineView;
    final TextView pointView;
    final TextView dateView;
    final ImageView status;
    final LinearLayout linearLayout;
    ViewHolder(View view){
        super(view);
        linearLayout = (LinearLayout) view.findViewById(R.id.oneItemLab);
        nameView = (TextView) view.findViewById(R.id.name);
        disciplineView = (TextView) view.findViewById((R.id.discipline));
        pointView = (TextView) view.findViewById((R.id.check_point));
        dateView = (TextView) view.findViewById(R.id.date_text);
        status = (ImageView) view.findViewById((R.id.status));
    }
}
}
