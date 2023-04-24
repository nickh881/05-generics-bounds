package ohm.softa.a05.model;

import java.util.Objects;

public class Shrub extends Plant {
    public Shrub(double h, String f, String n) {
        super(h, f, n);
    }

    @Override
    public PlantColor getColor() {
        return PlantColor.GREEN;
    }

}
