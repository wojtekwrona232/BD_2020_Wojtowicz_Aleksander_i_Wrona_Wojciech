/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;
import EntityClasses.Products;

import java.util.List;

public class ProductsDAO extends DAO<Products, Integer> {

    @Override
    public Products findById(Integer integer) {
        openCurrentSession();
        Products data = getCurrentSession().get(Products.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Products> findAll() {
        openCurrentSession();
        List<Products> list = (List<Products>) getCurrentSession().createCriteria(Products.class).list();
        closeCurrentSession();
        return list;
    }

    public void ProductsDaoSave(Products d) {
        this.save(d);
    }


    public void ProductsDaoUpdate(Products d) {
        this.update(d);
    }

    public void ProductsDaoDelete(Products d) {
        this.delete(d);
    }

    public void ProductsDaoDeleteAll() {
        this.deleteAll();
    }
}
