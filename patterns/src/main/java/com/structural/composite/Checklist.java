package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Checklist implements Completable {

    List<TodoItem> items = new ArrayList<>();

    public void addItem(TodoItem item){
        items.add(item);
    }

    @Override
    public void showStatus() {
        boolean completed = getStatusFromTodoItems();

        var statusText = completed ? " completed" : " not completed";

        System.out.println("Checklist is"+statusText);
    }

    private boolean getStatusFromTodoItems() {
        for(TodoItem item : items) {
            if(!item.isCompleted()){
                return false;
            }
        }
        return true;
    }
}
