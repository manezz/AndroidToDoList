package com.example.androidtodolist;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context mContext;
    ArrayList<ToDo> toDoList;

    public CustomAdapter(Context context, ArrayList<ToDo> todoList) {
        mContext = context;
        this.toDoList = todoList;
    }

    @Override
    public int getCount() {
        return toDoList.size();
    }

    @Override
    public Object getItem(int position) {
        return toDoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.activity_listview, parent, false);
        }

        ToDo tempToDo = (ToDo) getItem(position);

        EditText tvName = convertView.findViewById(R.id.tvName);
        CheckBox tvChecked = convertView.findViewById(R.id.tvChecked);

        tvName.setOnClickListener();
//        tvName.setOnEditorActionListener((v, actionId, event) -> {
//           tempToDo.name
//        });
        tvChecked.setOnCheckedChangeListener((buttonView, isChecked) -> {
            tempToDo.Checked = isChecked;
        });

        tvName.setText(tempToDo.name);
        tvChecked.setChecked(tempToDo.Checked);

        return convertView;
    }
}
