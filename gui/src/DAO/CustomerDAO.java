/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;

import java.util.List;

public class CustomerDAO extends DAO<Customer, Integer> {

    @Override
    public Customer findById(Integer integer) {
        openCurrentSession();
        Customer data = getCurrentSession().get(Customer.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Customer> findAll() {
        openCurrentSession();
        List<Customer> list = (List<Customer>) getCurrentSession().createCriteria(Customer.class).list();
        closeCurrentSession();
        return list;
    }

    public void CustomerDaoSave(Customer d) {
        this.save(d);
    }


    public void CustomerDaoUpdate(Customer d) {
        this.update(d);
    }

    public void CustomerDaoDelete(Customer d) {
        this.delete(d);
    }

    public void CustomerDaoDeleteAll() {
        this.deleteAll();
    }
}
