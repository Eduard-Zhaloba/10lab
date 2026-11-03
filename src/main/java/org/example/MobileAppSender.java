package org.example;

public class MobileAppSender extends NotificationSender {
    @Override
    public Notification createNotification() {
        return new MobileAppNotification();
    }
}