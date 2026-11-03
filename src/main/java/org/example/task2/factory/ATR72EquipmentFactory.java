package org.example.task2.factory;

import org.example.task2.equipment.BoardingStairs;
import org.example.task2.equipment.CargoLoader;
import org.example.task2.equipment.TowTractor;
import org.example.task2.equipment.atr72.ATR72BoardingStairs;
import org.example.task2.equipment.atr72.ATR72CargoLoader;
import org.example.task2.equipment.atr72.ATR72TowTractor;

public final class ATR72EquipmentFactory implements GroundEquipmentFactory {
    @Override
    public String getAircraftType() {
        return "ATR-72";
    }

    @Override
    public BoardingStairs createBoardingStairs() {
        return new ATR72BoardingStairs();
    }

    @Override
    public TowTractor createTowTractor() {
        return new ATR72TowTractor();
    }

    @Override
    public CargoLoader createCargoLoader() {
        return new ATR72CargoLoader();
    }
}
