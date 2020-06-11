/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package EntityClasses;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Orders {
    private int id;
    private String product_name;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int product_id;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int customer_id;
    private String customer_name;

    public Orders(int id, int product_id, int customer_id) {
        this.id = id;
        this.product_id = product_id;
        this.customer_id = customer_id;
    }

    public Orders() {

    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
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

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", customer_id=" + customer_id +
                '}';
    }
}
