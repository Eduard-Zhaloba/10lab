package org.example;

public class MobileAppNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[12:00] [MobileApp-Channel] Push-сповіщення у застосунку: \"" + message + "\"");
    }
}