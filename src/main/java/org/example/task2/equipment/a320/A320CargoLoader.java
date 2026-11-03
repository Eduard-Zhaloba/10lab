package org.example.task2.equipment.a320;

import org.example.task2.equipment.CargoLoader;

public final class A320CargoLoader implements CargoLoader {
    @Override
    public String getDescription() {
        return "Вантажний навантажувач для A320";
    }

    @Override
    public String getAircraftType() {
        return "A320";
    }
}
