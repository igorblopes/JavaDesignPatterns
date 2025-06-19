package com.structural.adapter;

public class TelegramSenderAdapter extends TelegramMessageSender implements MessageSender {

    @Override
    public void sendMessage(String destination, String message) {
        sendMessageToTelegram(destination, message);
    }

    @Override
    public void sendMessageToTelegram(String destination, String message) {
        System.out.println("WELCOME TO TELEGRAM");
        System.out.println("Connecting to Telegram destination: "+destination);
        System.out.println("Typing...");
        System.out.println("Sending message...");

        System.out.println("Send successfuly");
    }
}
