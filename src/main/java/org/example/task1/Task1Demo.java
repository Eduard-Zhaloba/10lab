package org.example.task1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task1Demo {
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void run() {
        FlightMissionDirector director = new FlightMissionDirector();

        log("Створюємо повне завдання для PS-101");
        FlightMission regular = director.createRegularFlight();
        log("Польотне завдання сформовано");
        System.out.println(regular);

        log("Створюємо мінімальне завдання для навчального польоту");
        FlightMission training = director.createTrainingFlight();
        log("Польотне завдання сформовано");
        System.out.println(training);

        log("Перевіряємо спробу створення без розрахунку палива");
        try {
            new FlightMissionBuilder()
                    .withFlightNumber("PS-999")
                    .withRoute("Чернівці → Київ")
                    .withWeatherReport("Видимість 10 км")
                    .build();
        } catch (IllegalStateException exception) {
            log(exception.getMessage());
        }
    }

    private static void log(String message) {
        System.out.println("[" + LocalTime.now().format(TIME_FORMAT) + "] [Task1] " + message);
    }

    public static void main(String[] args) {
        run();
    }
}
