package EntityClasses;

import org.jetbrains.annotations.Contract;

public class Units {
    private int id;
    private String unit_name;

    @Contract(pure = true)
    public Units() {
    }

    @Contract(pure = true)
    public Units( String unit_name) {
        this.unit_name = unit_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    @Override
    public String toString() {
        return "Units{" +
                "id=" + id +
                ", unit_name='" + unit_name + '\'' +
                '}';
    }
}
