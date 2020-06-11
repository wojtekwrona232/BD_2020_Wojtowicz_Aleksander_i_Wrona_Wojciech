/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package EntityClasses;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Products {
    private int id;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int product_type_id;
    private String product_type_name;
    private String product_name;
    private float price_net;
    private float price_gross;
    private float price_tax;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int unit_id;
    private String unit_name;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int product_state_id;
    private String product_state_name;

    private int quantity;

    public Products() {

    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_type_id() {
        return product_type_id;
    }

    public void setProduct_type_id(int product_type_id) {
        this.product_type_id = product_type_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getPrice_net() {
        return price_net;
    }

    public String getProduct_type_name() {
        return product_type_name;
    }

    public void setProduct_type_name(String product_type_name) {
        this.product_type_name = product_type_name;
    }

    public String getProduct_state_name() {
        return product_state_name;
    }

    public void setProduct_state_name(String product_state_name) {
        this.product_state_name = product_state_name;
    }

    public void setPrice_net(float price_net) {
        this.price_net = price_net;
    }

    public float getPrice_gross() {
        return price_gross;
    }

    public void setPrice_gross(float price_gross) {
        this.price_gross = price_gross;
    }

    public float getPrice_tax() {
        return price_tax;
    }

    public void setPrice_tax(float price_tax) {
        this.price_tax = price_tax;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public int getProduct_state_id() {
        return product_state_id;
    }

    public void setProduct_state_id(int product_state_id) {
        this.product_state_id = product_state_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", product_type_id=" + product_type_id +
                ", product_name='" + product_name + '\'' +
                ", price_net=" + price_net +
                ", price_gross=" + price_gross +
                ", price_tax=" + price_tax +
                ", unit_id=" + unit_id +
                ", product_state_id=" + product_state_id +
                ", quantity=" + quantity +
                '}';
    }
}
