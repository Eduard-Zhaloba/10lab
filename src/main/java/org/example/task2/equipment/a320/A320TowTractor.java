package org.example.task2.equipment.a320;

import org.example.task2.equipment.TowTractor;

public final class A320TowTractor implements TowTractor {
    @Override
    public String getDescription() {
        return "Буксирувальний тягач для A320";
    }

    @Override
    public String getAircraftType() {
        return "A320";
    }
}
