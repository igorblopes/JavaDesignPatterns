package com.structural.composite;

public class App {

    public static void main(String[] args) {
        Checklist checklist = new Checklist();

        var todoItem1 = new TodoItem("Task One");
        var todoItem2 = new TodoItem("Task Two");
        var todoItem3 = new TodoItem("Task Three");

        checklist.addItem(todoItem1);
        checklist.addItem(todoItem2);
        checklist.addItem(todoItem3);

        todoItem1.complete();
        todoItem1.showStatus();

        checklist.showStatus();

    }
}
