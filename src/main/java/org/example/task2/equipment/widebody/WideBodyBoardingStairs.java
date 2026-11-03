package org.example.task2.equipment.widebody;

import org.example.task2.equipment.BoardingStairs;

public final class WideBodyBoardingStairs implements BoardingStairs {
    @Override
    public String getDescription() {
        return "Трап для широкофюзеляжного літака";
    }

    @Override
    public String getAircraftType() {
        return "Широкофюзеляжний літак";
    }
}
