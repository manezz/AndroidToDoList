package com.example.androidtodolist;

public class ToDo {
    ToDo() {
        Checked = false;
    }
    ToDo(String name) {
        this.name = name;
        Checked = false;
    }
    String name;
    Boolean Checked;
}
