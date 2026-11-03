package org.example.task2.equipment.atr72;

import org.example.task2.equipment.TowTractor;

public final class ATR72TowTractor implements TowTractor {
    @Override
    public String getDescription() {
        return "Буксирувальний тягач для ATR-72";
    }

    @Override
    public String getAircraftType() {
        return "ATR-72";
    }
}
