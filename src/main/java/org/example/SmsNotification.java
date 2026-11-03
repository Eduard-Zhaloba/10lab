package org.example;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[12:00] [SMS-Channel] Відправлено SMS: \"" + message + "\"");
    }
}