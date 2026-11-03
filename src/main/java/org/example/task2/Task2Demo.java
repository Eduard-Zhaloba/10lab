package org.example.task2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.example.task2.equipment.a320.A320BoardingStairs;
import org.example.task2.equipment.atr72.ATR72TowTractor;
import org.example.task2.equipment.a320.A320CargoLoader;
import org.example.task2.factory.A320EquipmentFactory;
import org.example.task2.factory.ATR72EquipmentFactory;
import org.example.task2.factory.WideBodyEquipmentFactory;

public final class Task2Demo {
    private static final DateTimeFormatter TIME_FORMAT =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void run() {
        GroundServiceDispatcher dispatcher = new GroundServiceDispatcher();

        log("Обслуговування A320");
        dispatcher.serviceFlight("PS-101", new A320EquipmentFactory());

        log("Обслуговування ATR-72 тим самим диспетчером");
        dispatcher.serviceFlight("PS-202", new ATR72EquipmentFactory());

        log("Додаємо широкофюзеляжний літак без зміни диспетчера");
        dispatcher.serviceFlight("PS-303", new WideBodyEquipmentFactory());

        log("Перевірка заборони змішування обладнання");
        try {
            new EquipmentKit("A320", new A320BoardingStairs(),
                    new ATR72TowTractor(), new A320CargoLoader());
        } catch (IllegalArgumentException exception) {
            log(exception.getMessage());
        }
    }

    private static void log(String message) {
        System.out.println("[" + LocalTime.now().format(TIME_FORMAT)
                + "] [Task2Demo] " + message);
    }

    public static void main(String[] args) {
        run();
    }
}
