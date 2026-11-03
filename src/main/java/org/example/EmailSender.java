package org.example;

public class EmailSender extends NotificationSender {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}