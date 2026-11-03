package org.example.task2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import org.example.task2.factory.GroundEquipmentFactory;

public final class GroundServiceDispatcher {
    private static final DateTimeFormatter TIME_FORMAT =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    public EquipmentKit serviceFlight(String flightNumber, GroundEquipmentFactory factory) {
        if (flightNumber == null || flightNumber.isBlank()) {
            throw new IllegalArgumentException("Номер рейсу не задано");
        }
        Objects.requireNonNull(factory, "Фабрику обладнання не задано");

        log("Для рейсу " + flightNumber + " обрано тип " + factory.getAircraftType());

        EquipmentKit kit = new EquipmentKit(
                factory.getAircraftType(),
                factory.createBoardingStairs(),
                factory.createTowTractor(),
                factory.createCargoLoader());

        log("Рейсу " + flightNumber + " видано сумісний комплект");
        System.out.println(kit);
        return kit;
    }

    private void log(String message) {
        System.out.println("[" + LocalTime.now().format(TIME_FORMAT)
                + "] [GroundServiceDispatcher] " + message);
    }
}
