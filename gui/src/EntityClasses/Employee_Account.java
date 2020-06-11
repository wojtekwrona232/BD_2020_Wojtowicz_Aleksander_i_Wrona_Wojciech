/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package EntityClasses;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Employee_Account {
    private int id;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int type_id;
    private String type_name;
    private String login;
    private String password;
    private String account_create_date;

    public Employee_Account() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
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

    public String getAccount_create_date() {
        return account_create_date;
    }

    public void setAccount_create_date(String account_create_date) {
        this.account_create_date = account_create_date;
    }

    @Override
    public String toString() {
        return "Employee_Account{" +
                "id=" + id +
                ", type_id=" + type_id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", account_create_date='" + account_create_date + '\'' +
                '}';
    }
}
