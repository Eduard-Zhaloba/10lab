package org.example.task2.factory;

import org.example.task2.equipment.BoardingStairs;
import org.example.task2.equipment.CargoLoader;
import org.example.task2.equipment.TowTractor;
import org.example.task2.equipment.widebody.WideBodyBoardingStairs;
import org.example.task2.equipment.widebody.WideBodyCargoLoader;
import org.example.task2.equipment.widebody.WideBodyTowTractor;

public final class WideBodyEquipmentFactory implements GroundEquipmentFactory {
    @Override
    public String getAircraftType() {
        return "Широкофюзеляжний літак";
    }

    @Override
    public BoardingStairs createBoardingStairs() {
        return new WideBodyBoardingStairs();
    }

    @Override
    public TowTractor createTowTractor() {
        return new WideBodyTowTractor();
    }

    @Override
    public CargoLoader createCargoLoader() {
        return new WideBodyCargoLoader();
    }
}
