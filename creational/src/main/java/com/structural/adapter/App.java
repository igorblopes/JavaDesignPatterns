package com.structural.adapter;

public class App {

    public static void main(String[] args) {
        var whatsappMessager = new WhatsAppMessageSender();
        var chatApplication = new ChatApplication(whatsappMessager);

        chatApplication.sendmessage("Roger", "Hello World");


        var telegramMessageSender = new TelegramSenderAdapter();
        var chatApplicationTelegram = new ChatApplication(telegramMessageSender);
        chatApplicationTelegram.sendmessage("Melissa", "Hello World");
    }
}
