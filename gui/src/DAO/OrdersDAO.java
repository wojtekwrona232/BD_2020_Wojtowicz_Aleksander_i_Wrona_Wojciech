/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Customer;
import EntityClasses.Orders;

import java.util.List;

public class OrdersDAO extends DAO<Orders, Integer> {

    @Override
    public Orders findById(Integer integer) {
        openCurrentSession();
        Orders data = getCurrentSession().get(Orders.class, integer);
        closeCurrentSession();
        return data;
    }

    @Override
    public List<Orders> findAll() {
        openCurrentSession();
        List<Orders> list = (List<Orders>) getCurrentSession().createCriteria(Orders.class).list();
        closeCurrentSession();
        return list;
    }

    public void OrdersDaoSave(Orders d) {
        this.save(d);
    }


    public void OrdersDaoUpdate(Orders d) {
        this.update(d);
    }

    public void OrdersDaoDelete(Orders d) {
        this.delete(d);
    }

    public void OrdersDaoDeleteAll() {
        this.deleteAll();
    }
}
