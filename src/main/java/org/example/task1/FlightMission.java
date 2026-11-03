package org.example.task1;

import java.util.List;

public final class FlightMission {
    private final String flightNumber;
    private final String route;
    private final List<String> alternateAirports;
    private final String fuelCalculation;
    private final String weatherReport;
    private final String pilotBriefing;
    private final String cargoInfo;
    private final String specialInstructions;

    FlightMission(FlightMissionBuilder builder) {
        this.flightNumber = builder.getFlightNumber();
        this.route = builder.getRoute();
        this.alternateAirports = List.copyOf(builder.getAlternateAirports());
        this.fuelCalculation = builder.getFuelCalculation();
        this.weatherReport = builder.getWeatherReport();
        this.pilotBriefing = builder.getPilotBriefing();
        this.cargoInfo = builder.getCargoInfo();
        this.specialInstructions = builder.getSpecialInstructions();
    }

    public String getFlightNumber() { return flightNumber; }
    public String getRoute() { return route; }
    public List<String> getAlternateAirports() { return alternateAirports; }
    public String getFuelCalculation() { return fuelCalculation; }
    public String getWeatherReport() { return weatherReport; }
    public String getPilotBriefing() { return pilotBriefing; }
    public String getCargoInfo() { return cargoInfo; }
    public String getSpecialInstructions() { return specialInstructions; }

    @Override
    public String toString() {
        return "Польотне завдання " + flightNumber + "\n"
                + "  Маршрут: " + route + "\n"
                + "  Запасні аеродроми: " + (alternateAirports.isEmpty() ? "не задано" : String.join(", ", alternateAirports)) + "\n"
                + "  Розрахунок палива: " + fuelCalculation + "\n"
                + "  Метеозведення: " + weatherReport + "\n"
                + "  Повідомлення пілотам: " + optional(pilotBriefing) + "\n"
                + "  Дані про вантаж: " + optional(cargoInfo) + "\n"
                + "  Особливі вказівки: " + optional(specialInstructions);
    }

    private static String optional(String value) {
        return value == null ? "не задано" : value;
    }
}
