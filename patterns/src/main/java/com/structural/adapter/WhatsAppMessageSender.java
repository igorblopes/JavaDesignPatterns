package com.structural.adapter;

public class WhatsAppMessageSender implements MessageSender{
    @Override
    public void sendMessage(String destination, String message) {
        System.out.println("WELCOME TO WHATSAPP");
        System.out.println("Connecting to WhatsApp destination: "+destination);
        System.out.println("Sending message...");
    }
}
