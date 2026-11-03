package org.example.task2.equipment.atr72;

import org.example.task2.equipment.BoardingStairs;

public final class ATR72BoardingStairs implements BoardingStairs {
    @Override
    public String getDescription() {
        return "Трап для ATR-72";
    }

    @Override
    public String getAircraftType() {
        return "ATR-72";
    }
}
