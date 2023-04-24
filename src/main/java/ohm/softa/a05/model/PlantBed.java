package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

public class PlantBed<T extends Plant> {
    SimpleList<T> plants;

    public PlantBed(){
        plants = new SimpleListImpl<>();
    }

    public void add(T plant){
        plants.add(plant);
    }

    public int size(){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color){
        return plants.filter(p -> p.getColor().equals(color));
    }
    public SimpleList<T> getPlants() {
        //hack to get a copy of the current list
        return plants.map(p -> p);
    }
    public void remove(T p){
        plants = plants.filter(o -> !o.equals(p));
    }
}
