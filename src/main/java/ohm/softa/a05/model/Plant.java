package ohm.softa.a05.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Plant implements Comparable<Plant> {
    double height;
    String family;
    String name;

    protected Plant(double h, String f, String n){
        height = h;
        family = f;
        name = n;
    }

    public double getHeight(){return height;}
    public String getFamily(){return family;}
    public String getName(){return name;}
    public abstract PlantColor getColor();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Plant)) return false;

        Plant plant = (Plant) o;

        return new EqualsBuilder()
                .append(getHeight(), plant.getHeight())
                .append(getFamily(), plant.getFamily())
                .append(getName(), plant.getName())
                .append(getColor(), plant.getColor())
                .isEquals();
    }
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getFamily())
                .append(getName())
                .append(getHeight())
                .append(getColor())
                .toHashCode();
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("family", family)
                .append("name", name)
                .append("height", height)
                .append("color", getColor())
                .toString();
    }
    @Override
    public int compareTo(Plant plant) {
        return Double.compare(this.height, plant.height);
    }

}
