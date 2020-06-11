/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;
import EntityClasses.Product_Type;

import java.util.List;

public class Product_typeDAO extends DAO<Product_Type, Integer> {

    @Override
    public Product_Type findById(Integer integer) {
        openCurrentSession();
        Product_Type data = getCurrentSession().get(Product_Type.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Product_Type> findAll() {
        openCurrentSession();
        List<Product_Type> list = (List<Product_Type>) getCurrentSession().createCriteria(Product_Type.class).list();
        closeCurrentSession();
        return list;
    }

    public void Product_TypeDaoSave(Product_Type d) {
        this.save(d);
    }


    public void Product_TypeDaoUpdate(Product_Type d) {
        this.update(d);
    }

    public void Product_TypeDaoDelete(Product_Type d) {
        this.delete(d);
    }

    public void Product_TypeDaoDeleteAll() {
        this.deleteAll();
    }
}
