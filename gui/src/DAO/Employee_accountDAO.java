/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;
import EntityClasses.Employee_Account;

import java.util.List;

public class Employee_accountDAO extends DAO<Employee_Account, Integer> {

    @Override
    public Employee_Account findById(Integer integer) {
        openCurrentSession();
        Employee_Account data = getCurrentSession().get(Employee_Account.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Employee_Account> findAll() {
        openCurrentSession();
        List<Employee_Account> list = (List<Employee_Account>) getCurrentSession().createCriteria(Employee_Account.class).list();
        closeCurrentSession();
        return list;
    }

    public void Employee_AccountDaoSave(Employee_Account d) {
        this.save(d);
    }


    public void Employee_AccountDaoUpdate(Employee_Account d) {
        this.update(d);
    }

    public void Employee_AccountDaoDelete(Employee_Account d) {
        this.delete(d);
    }

    public void Employee_AccountDaoDeleteAll() {
        this.deleteAll();
    }
}
