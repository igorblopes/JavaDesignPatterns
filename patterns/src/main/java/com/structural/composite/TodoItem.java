package com.structural.composite;

public class TodoItem implements Completable {

    private final String description;
    private boolean completed = false;


    public TodoItem(String description) {
        this.description = description;
    }

    public void complete() {
        completed = true;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    @Override
    public void showStatus() {
        var completedText = completed ? " completed! " : " not completed!";
        System.out.println("Todo item "+ description + " is"+ completedText);
    }
}
