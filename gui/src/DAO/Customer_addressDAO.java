/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer_Address;

import java.util.List;

public class Customer_addressDAO extends DAO<Customer_Address, Integer> {

    @Override
    public Customer_Address findById(Integer integer) {
        openCurrentSession();
        Customer_Address data = getCurrentSession().get(Customer_Address.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Customer_Address> findAll() {
        openCurrentSession();
        List<Customer_Address> list = (List<Customer_Address>) getCurrentSession().createCriteria(Customer_Address.class).list();
        closeCurrentSession();
        return list;
    }

    public void Customer_AddressDaoSave(Customer_Address d) {
        this.save(d);
    }


    public void Customer_AddressDaoUpdate(Customer_Address d) {
        this.update(d);
    }

    public void Customer_AddressDaoDelete(Customer_Address d) {
        this.delete(d);
    }

    public void Customer_AddressDaoDeleteAll() {
        this.deleteAll();
    }
}