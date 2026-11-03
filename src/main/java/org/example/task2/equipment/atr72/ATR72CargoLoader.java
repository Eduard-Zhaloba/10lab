package org.example.task2.equipment.atr72;

import org.example.task2.equipment.CargoLoader;

public final class ATR72CargoLoader implements CargoLoader {
    @Override
    public String getDescription() {
        return "Вантажний навантажувач для ATR-72";
    }

    @Override
    public String getAircraftType() {
        return "ATR-72";
    }
}
