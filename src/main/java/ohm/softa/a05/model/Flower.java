package ohm.softa.a05.model;

import java.util.Objects;

public class Flower extends Plant {
    PlantColor color;
    public Flower(double h, String f, String n, PlantColor c) {
        super(h, f, n);
        if(c != PlantColor.GREEN){
            color = c;
        }
        else{
            throw new IllegalArgumentException("A plant can't be green!");
        }
    }

    @Override
    public PlantColor getColor() {
        return color;
    }
}
