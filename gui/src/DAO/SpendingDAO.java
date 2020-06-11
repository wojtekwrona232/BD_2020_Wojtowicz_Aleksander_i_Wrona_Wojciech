/*
 * Copyright (c) 2019. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Spending;

import java.util.List;

public class SpendingDAO extends DAO<Spending, Integer>{

    @Override
    public Spending findById(Integer integer) {
        openCurrentSession();
        Spending spending = getCurrentSession().get(Spending.class, integer);
        closeCurrentSession();
        return spending;
    }

    @Override
    public List<Spending> findAll() {
        openCurrentSession();
        List<Spending> list = (List<Spending>) getCurrentSession().createCriteria(Spending.class).list();
        closeCurrentSession();
        return list;
    }

    public void SpendingDaoSave(Spending d) {
        this.save(d);
    }

    public void SpendingDaoUpdate(Spending d) {
        this.update(d);
    }

    public void SpendingDaoDelete(Spending d) {
        this.delete(d);
    }

    public void SpendingDaoDeleteAll() {
        this.deleteAll();
    }

}
