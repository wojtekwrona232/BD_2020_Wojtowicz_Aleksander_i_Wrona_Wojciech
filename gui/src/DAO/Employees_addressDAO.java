/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;
import EntityClasses.Employee_Address;

import java.util.List;

public class Employees_addressDAO extends DAO<Employee_Address, Integer> {

    @Override
    public Employee_Address findById(Integer integer) {
        openCurrentSession();
        Employee_Address data = getCurrentSession().get(Employee_Address.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Employee_Address> findAll() {
        openCurrentSession();
        List<Employee_Address> list = (List<Employee_Address>) getCurrentSession().createCriteria(Employee_Address.class).list();
        closeCurrentSession();
        return list;
    }

    public void Employee_AddressDaoSave(Employee_Address d) {
        this.save(d);
    }


    public void Employee_AddressDaoUpdate(Employee_Address d) {
        this.update(d);
    }

    public void Employee_AddressDaoDelete(Employee_Address d) {
        this.delete(d);
    }

    public void Employee_AddressDaoDeleteAll() {
        this.deleteAll();
    }
}
