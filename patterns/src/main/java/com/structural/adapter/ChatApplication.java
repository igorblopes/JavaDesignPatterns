package com.structural.adapter;

public class ChatApplication {

    private final MessageSender messageSender;


    public ChatApplication(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendmessage(String destination, String message) {
        messageSender.sendMessage(destination, message);
    }
}
