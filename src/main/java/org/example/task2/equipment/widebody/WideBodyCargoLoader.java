package org.example.task2.equipment.widebody;

import org.example.task2.equipment.CargoLoader;

public final class WideBodyCargoLoader implements CargoLoader {
    @Override
    public String getDescription() {
        return "Вантажний навантажувач для широкофюзеляжного літака";
    }

    @Override
    public String getAircraftType() {
        return "Широкофюзеляжний літак";
    }
}
