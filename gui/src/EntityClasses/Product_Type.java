/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package EntityClasses;

public class Product_Type {
    private int id;
    private String product_name;

    public Product_Type() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    @Override
    public String toString() {
        return "Product_State{" +
                "id=" + id +
                ", state_name='" + product_name + '\'' +
                '}';
    }
}
