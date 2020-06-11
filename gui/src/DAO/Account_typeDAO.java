/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Account_Type;

import java.util.List;

public class Account_typeDAO extends DAO<Account_Type, Integer> {

@Override
public Account_Type findById(Integer integer) {
        openCurrentSession();
        Account_Type data = getCurrentSession().get(Account_Type.class, integer);
        closeCurrentSession();
        return data;
        }

@Override
public List<Account_Type> findAll() {
        openCurrentSession();
        List<Account_Type> list = (List<Account_Type>) getCurrentSession().createCriteria(Account_Type.class).list();
        closeCurrentSession();
        return list;
        }

public void Account_TypeDaoSave(Account_Type d) {
        this.save(d);
        }


public void Account_TypeDaoUpdate(Account_Type d) {
        this.update(d);
        }

public void Account_TypeDaoDelete(Account_Type d) {
        this.delete(d);
        }

public void Account_TypeDaoDeleteAll() {
        this.deleteAll();
        }
}