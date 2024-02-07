package com.example.androidtodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<ToDo> toDoList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.todoListView);

        addToDos();
        fillListView();
    }

    public void addToDos() {
        for (int i = 0; i < 10; i++) {
            toDoList.add(new ToDo("Test"));
        }
    }

    public void fillListView() {
        CustomAdapter myCustomAdapter = new CustomAdapter(MainActivity.this, toDoList);
        listView.setAdapter(myCustomAdapter);
    }
    
}