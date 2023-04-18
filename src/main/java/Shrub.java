import java.util.Objects;

public class Shrub extends Plant {
    public Shrub(double h, String f, String n) {
        super(h, f, n);
    }

    @Override
    public PlantColor getColor() {
        return PlantColor.GREEN;
    }


    @Override
    public int compareTo(Plant other) {
        if(this.getHeight() > other.getHeight()) {
            return 1;
        }
        else if(this.getHeight() == other.getHeight()){
            return 0;
        }
        else{
            return -1;
        }
    }
    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Flower flower = (Flower) o;
        // field comparison
        return Objects.equals(this.getHeight(), flower.getHeight())
                && Objects.equals(this.getHeight(), flower.getFamily()) && Objects.equals(this.getName(), flower.getName());
    }

    @Override
    public String toString(){
        return "height " + this.getHeight() + " family: " + this.getFamily() + " name: " + this.getName() + " color: " + PlantColor.GREEN;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) this.getHeight();
        hash = 31 * hash + (this.getName().hashCode());
        hash = 31 * hash + (this.getFamily().hashCode());
        return hash;
    }
}
