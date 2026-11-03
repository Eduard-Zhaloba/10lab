package org.example.task1;

import java.util.ArrayList;
import java.util.List;

public class FlightMissionBuilder {
    private String flightNumber;
    private String route;
    private final List<String> alternateAirports = new ArrayList<>();
    private String fuelCalculation;
    private String weatherReport;
    private String pilotBriefing;
    private String cargoInfo;
    private String specialInstructions;

    public FlightMissionBuilder withFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public FlightMissionBuilder withRoute(String route) {
        this.route = route;
        return this;
    }

    public FlightMissionBuilder withAlternateAirports(List<String> airports) {
        alternateAirports.clear();
        if (airports != null) {
            alternateAirports.addAll(airports);
        }
        return this;
    }

    public FlightMissionBuilder withFuelCalculation(String fuelCalculation) {
        this.fuelCalculation = fuelCalculation;
        return this;
    }

    public FlightMissionBuilder withWeatherReport(String weatherReport) {
        this.weatherReport = weatherReport;
        return this;
    }

    public FlightMissionBuilder withPilotBriefing(String pilotBriefing) {
        this.pilotBriefing = pilotBriefing;
        return this;
    }

    public FlightMissionBuilder withCargoInfo(String cargoInfo) {
        this.cargoInfo = cargoInfo;
        return this;
    }

    public FlightMissionBuilder withSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
        return this;
    }

    public FlightMission build() {
        require(flightNumber, "номер рейсу");
        require(route, "маршрут");
        require(fuelCalculation, "розрахунок палива");
        require(weatherReport, "метеозведення");
        return new FlightMission(this);
    }

    private static void require(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalStateException(
                    "Неможливо сформувати польотне завдання: не задано " + fieldName);
        }
    }

    String getFlightNumber() { return flightNumber; }
    String getRoute() { return route; }
    List<String> getAlternateAirports() { return alternateAirports; }
    String getFuelCalculation() { return fuelCalculation; }
    String getWeatherReport() { return weatherReport; }
    String getPilotBriefing() { return pilotBriefing; }
    String getCargoInfo() { return cargoInfo; }
    String getSpecialInstructions() { return specialInstructions; }
}
