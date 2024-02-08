package com.example.androidtodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<ToDo> toDoList = new ArrayList<>();
    ListView listView;
    Button newToDoButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.todoListView);
        newToDoButton = findViewById(R.id.newToDoButton);

        newToDoButton.setOnClickListener(this);

        fillListView();
    }

    public void addToDo() {
        toDoList.add(new ToDo());
        ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();

    }

    public void addToDos() {
        for (int i = 0; i < 25; i++) {
            toDoList.add(new ToDo("Test"));
        }
    }

    public void fillListView() {
        CustomAdapter myCustomAdapter = new CustomAdapter(MainActivity.this, toDoList);
        listView.setAdapter(myCustomAdapter);

    }

    @Override
    public void onClick(View v) {
        addToDo();
    }
}