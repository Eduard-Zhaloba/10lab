package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦІЯ ЗАВДАННЯ 3 (Factory Method): Сповіщення пасажирів ===\n");

        String alertMessage = "Рейс PS-101 затримується на 40 хвилин.";

        System.out.println("--- Стандартні канали сповіщення ---");

        NotificationSender smsSender = new SmsSender();
        smsSender.notifyPassenger(alertMessage);
        System.out.println();

        NotificationSender emailSender = new EmailSender();
        emailSender.notifyPassenger(alertMessage);
        System.out.println();

        NotificationSender boardSender = new BoardSender();
        boardSender.notifyPassenger(alertMessage);
        System.out.println();

        System.out.println("--- Додавання нового каналу 'мобільний застосунок' ---");
        NotificationSender appSender = new MobileAppSender();
        appSender.notifyPassenger("Зміна виходу на посадку: вихід №3.");
    }
}