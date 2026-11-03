package org.example.task2.factory;

import org.example.task2.equipment.BoardingStairs;
import org.example.task2.equipment.CargoLoader;
import org.example.task2.equipment.TowTractor;
import org.example.task2.equipment.a320.A320BoardingStairs;
import org.example.task2.equipment.a320.A320CargoLoader;
import org.example.task2.equipment.a320.A320TowTractor;

public final class A320EquipmentFactory implements GroundEquipmentFactory {
    @Override
    public String getAircraftType() {
        return "A320";
    }

    @Override
    public BoardingStairs createBoardingStairs() {
        return new A320BoardingStairs();
    }

    @Override
    public TowTractor createTowTractor() {
        return new A320TowTractor();
    }

    @Override
    public CargoLoader createCargoLoader() {
        return new A320CargoLoader();
    }
}
