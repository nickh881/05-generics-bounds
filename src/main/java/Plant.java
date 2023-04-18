public abstract class Plant implements Comparable<Plant>{
    double height;
    String family;
    String name;

    public Plant(double h, String f, String n){
        height = h;
        family = f;
        name = n;
    }

    public double getHeight(){return height;}
    public String getFamily(){return family;}
    public String getName(){return name;}
    public abstract PlantColor getColor();
}
