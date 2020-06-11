/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;
import EntityClasses.Customer_Account;

import java.util.List;

public class Customer_accountDAO extends DAO<Customer_Account, Integer> {

    @Override
    public Customer_Account findById(Integer integer) {
        openCurrentSession();
        Customer_Account data = getCurrentSession().get(Customer_Account.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Customer_Account> findAll() {
        openCurrentSession();
        List<Customer_Account> list = (List<Customer_Account>) getCurrentSession().createCriteria(Customer_Account.class).list();
        closeCurrentSession();
        return list;
    }

    public void Customer_AccountDaoSave(Customer_Account d) {
        this.save(d);
    }


    public void Customer_AccountDaoUpdate(Customer_Account d) {
        this.update(d);
    }

    public void Customer_AccountDaoDelete(Customer_Account d) {
        this.delete(d);
    }

    public void Customer_AccountDaoDeleteAll() {
        this.deleteAll();
    }
}