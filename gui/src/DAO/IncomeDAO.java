/*
 * Copyright (c) 2019. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Income;

import java.util.List;

public class IncomeDAO extends DAO<Income, Integer>{

    @Override
    public Income findById(Integer integer) {
        openCurrentSession();
        Income income = getCurrentSession().get(Income.class, integer);
        closeCurrentSession();
        return income;
    }

    @Override
    public List<Income> findAll() {
        openCurrentSession();
        List<Income> list = (List<Income>) getCurrentSession().createCriteria(Income.class).list();
        closeCurrentSession();
        return list;
    }

    public void IncomeDaoSave(Income d) {
        this.save(d);
    }


    public void IncomeDaoUpdate(Income d) {
        this.update(d);
    }

    public void IncomeDaoDelete(Income d) {
        this.delete(d);
    }

    public void IncomeDaoDeleteAll() {
        this.deleteAll();
    }

}
