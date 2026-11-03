package org.example;

public abstract class NotificationSender {
    public abstract Notification createNotification();

    public void notifyPassenger(String message) {
        System.out.println("[11:59] [System] Підготовка даних сповіщення...");

        Notification notification = createNotification();
        notification.send(message);

        System.out.println("[12:01] [System] Подію успішно занесено до системного журналу.");
    }
}