/*
 * Copyright (c) 2019. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Employees;

import java.util.List;

public class EmployeesDAO extends DAO<Employees, Integer>{

    @Override
    public Employees findById(Integer integer) {
        openCurrentSession();
        Employees employees = getCurrentSession().get(Employees.class, integer);
        closeCurrentSession();
        return employees;
    }

    @Override
    public List<Employees> findAll() {
        openCurrentSession();
        List<Employees> list = (List<Employees>) getCurrentSession().createCriteria(Employees.class).list();
        closeCurrentSession();
        return list;
    }

    public void EmployeesDaoSave(Employees d) {
        this.save(d);
    }


    public void EmployeesDaoUpdate(Employees d) {
        this.update(d);
    }

    public void EmployeesDaoDelete(Employees d) {
        this.delete(d);
    }

    public void EmployeesDaoDeleteAll() {
        this.deleteAll();
    }

}
