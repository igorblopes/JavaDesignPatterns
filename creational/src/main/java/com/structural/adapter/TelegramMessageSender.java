package com.structural.adapter;

public class TelegramMessageSender{


    public void sendMessageToTelegram(String destination, String message) {
        System.out.println("WELCOME TO TELEGRAM");
        System.out.println("Connecting to Telegram destination: "+destination);
        System.out.println("Sending message...");
    }
}
