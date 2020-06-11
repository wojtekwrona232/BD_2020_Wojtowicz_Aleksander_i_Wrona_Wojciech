/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package EntityClasses;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Customer {
    private int id;
    private String first_name;
    private String last_name;
    private long phone_number;
    private String email;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int address_id;
    private String address;
    @OneToOne (
            cascade = CascadeType.ALL
    )
    private int account_id;

    public Customer(int id, String first_name, String last_name, long phone_number, String email, int address_id, int account_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.address_id = address_id;
        this.account_id = account_id;
    }

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addess) {
        this.address = addess;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                ", address_id=" + address_id +
                ", account_id=" + account_id +
                '}';
    }
}
