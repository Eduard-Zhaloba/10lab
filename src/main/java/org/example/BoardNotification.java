package org.example;

public class BoardNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[12:00] [Board-Channel] Виведено на інформаційне табло: \"" + message.toUpperCase() + "\"");
    }
}