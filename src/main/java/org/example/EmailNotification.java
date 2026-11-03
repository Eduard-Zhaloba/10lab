package org.example;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[12:00] [Email-Channel] Надіслано електронний лист з оформленням: \"" + message + "\"");
    }
}