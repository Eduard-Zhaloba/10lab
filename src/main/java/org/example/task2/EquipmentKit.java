package org.example.task2;

import java.util.Objects;
import org.example.task2.equipment.BoardingStairs;
import org.example.task2.equipment.CargoLoader;
import org.example.task2.equipment.TowTractor;

public final class EquipmentKit {
    private final String aircraftType;
    private final BoardingStairs boardingStairs;
    private final TowTractor towTractor;
    private final CargoLoader cargoLoader;

    public EquipmentKit(String aircraftType, BoardingStairs boardingStairs,
                        TowTractor towTractor, CargoLoader cargoLoader) {
        this.aircraftType = Objects.requireNonNull(aircraftType, "Тип літака не задано");
        this.boardingStairs = Objects.requireNonNull(boardingStairs, "Трап не задано");
        this.towTractor = Objects.requireNonNull(towTractor, "Тягач не задано");
        this.cargoLoader = Objects.requireNonNull(cargoLoader, "Навантажувач не задано");

        if (aircraftType.isBlank()
                || !aircraftType.equals(boardingStairs.getAircraftType())
                || !aircraftType.equals(towTractor.getAircraftType())
                || !aircraftType.equals(cargoLoader.getAircraftType())) {
            throw new IllegalArgumentException(
                    "Несумісне обладнання: усі частини комплекту мають відповідати типу літака "
                            + aircraftType);
        }
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public BoardingStairs getBoardingStairs() {
        return boardingStairs;
    }

    public TowTractor getTowTractor() {
        return towTractor;
    }

    public CargoLoader getCargoLoader() {
        return cargoLoader;
    }

    @Override
    public String toString() {
        return "Комплект для " + aircraftType + ":\n"
                + "  Трап: " + boardingStairs.getDescription() + "\n"
                + "  Тягач: " + towTractor.getDescription() + "\n"
                + "  Навантажувач: " + cargoLoader.getDescription();
    }
}
