package org.example.task1;

import java.util.List;

public class FlightMissionDirector {
    public FlightMission createRegularFlight() {
        FlightMissionBuilder builder = prepareRequiredParts(
                "PS-101", "Чернівці → Варшава",
                "Заплановано 3200 кг, резерв 700 кг",
                "Видимість 10 км, вітер 5 м/с");

        return builder
                .withAlternateAirports(List.of("Львів", "Краків"))
                .withPilotBriefing("Перевірити NOTAM перед вильотом")
                .withCargoInfo("Багаж пасажирів: 1800 кг")
                .withSpecialInstructions("Підтвердити готовність екіпажу")
                .build();
    }

    public FlightMission createTrainingFlight() {
        FlightMissionBuilder builder = prepareRequiredParts(
                "TR-001", "Чернівці → тренувальне коло → Чернівці",
                "Заплановано 450 кг, резерв 150 кг",
                "Видимість 12 км, вітер 3 м/с");
        return builder.build();
    }

    private FlightMissionBuilder prepareRequiredParts(
            String flightNumber, String route, String fuelCalculation, String weatherReport) {
        return new FlightMissionBuilder()
                .withFlightNumber(flightNumber)
                .withRoute(route)
                .withFuelCalculation(fuelCalculation)
                .withWeatherReport(weatherReport);
    }
}
