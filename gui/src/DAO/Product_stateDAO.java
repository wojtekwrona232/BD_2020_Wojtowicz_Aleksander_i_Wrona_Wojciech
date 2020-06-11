/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;
import EntityClasses.Product_State;

import java.util.List;

public class Product_stateDAO extends DAO<Product_State, Integer> {

    @Override
    public Product_State findById(Integer integer) {
        openCurrentSession();
        Product_State data = getCurrentSession().get(Product_State.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Product_State> findAll() {
        openCurrentSession();
        List<Product_State> list = (List<Product_State>) getCurrentSession().createCriteria(Product_State.class).list();
        closeCurrentSession();
        return list;
    }

    public void Product_StateDaoSave(Product_State d) {
        this.save(d);
    }


    public void Product_StateDaoUpdate(Product_State d) {
        this.update(d);
    }

    public void Product_StateDaoDelete(Product_State d) {
        this.delete(d);
    }

    public void Product_StateDaoDeleteAll() {
        this.deleteAll();
    }
}
