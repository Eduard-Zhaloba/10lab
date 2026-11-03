package org.example;

public class SmsSender extends NotificationSender {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}