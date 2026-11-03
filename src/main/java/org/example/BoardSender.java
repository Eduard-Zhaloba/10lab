package org.example;

public class BoardSender extends NotificationSender {
    @Override
    public Notification createNotification() {
        return new BoardNotification();
    }
}