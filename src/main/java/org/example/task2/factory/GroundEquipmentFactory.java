package org.example.task2.factory;

import org.example.task2.equipment.BoardingStairs;
import org.example.task2.equipment.CargoLoader;
import org.example.task2.equipment.TowTractor;

public interface GroundEquipmentFactory {
    String getAircraftType();
    BoardingStairs createBoardingStairs();
    TowTractor createTowTractor();
    CargoLoader createCargoLoader();
}
