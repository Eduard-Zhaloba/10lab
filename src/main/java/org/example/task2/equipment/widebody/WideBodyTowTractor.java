package org.example.task2.equipment.widebody;

import org.example.task2.equipment.TowTractor;

public final class WideBodyTowTractor implements TowTractor {
    @Override
    public String getDescription() {
        return "Буксирувальний тягач для широкофюзеляжного літака";
    }

    @Override
    public String getAircraftType() {
        return "Широкофюзеляжний літак";
    }
}
