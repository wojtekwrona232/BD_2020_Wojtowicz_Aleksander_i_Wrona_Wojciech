/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package EntityClasses;

public class Product_State {
    private int id;
    private String state_name;

    public Product_State(int id, String state_name) {
        this.id = id;
        this.state_name = state_name;
    }

    public Product_State() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    @Override
    public String toString() {
        return "Product_State{" +
                "id=" + id +
                ", state_name='" + state_name + '\'' +
                '}';
    }
}
