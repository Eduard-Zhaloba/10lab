package org.example.task2.equipment.a320;

import org.example.task2.equipment.BoardingStairs;

public final class A320BoardingStairs implements BoardingStairs {
    @Override
    public String getDescription() {
        return "Трап для A320";
    }

    @Override
    public String getAircraftType() {
        return "A320";
    }
}
