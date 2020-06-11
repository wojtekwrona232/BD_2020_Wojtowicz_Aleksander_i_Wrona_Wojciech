/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package EntityClasses;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Customer_Account {
    private int id;
    private String login;
    private String password;
    private String acc_create_date;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int type_id;
    private String type_name;

    public Customer_Account() {

    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAcc_create_date() {
        return acc_create_date;
    }

    public void setAcc_create_date(String acc_create_date) {
        this.acc_create_date = acc_create_date;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }
}
