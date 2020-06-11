package EntityClasses;

import org.jetbrains.annotations.Contract;

public class Position {
    private int id;
    private String position_name;

    @Contract(pure = true)
    public Position() {
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", position_name='" + position_name + '\'' +
                '}';
    }

    @Contract(pure = true)
    public Position(String possition_name) {
        this.position_name = possition_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

}
