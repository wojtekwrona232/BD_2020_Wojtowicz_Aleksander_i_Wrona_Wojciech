/*
 * Copyright (c) 2019. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Units;

import java.util.List;

public class UnitsDAO extends DAO<Units, Integer>{

    @Override
    public Units findById(Integer integer) {
        openCurrentSession();
        Units units = getCurrentSession().get(Units.class, integer);
        closeCurrentSession();
        return units;
    }

    @Override
    public List<Units> findAll() {
        openCurrentSession();
        List<Units> list = (List<Units>) getCurrentSession().createCriteria(Units.class).list();
        closeCurrentSession();
        return list;
    }

    public void UnitsDaoSave(Units d) {
        this.save(d);
    }


    public void UnitsDaoUpdate(Units d) {
        this.update(d);
    }

    public void UnitsDaoDelete(Units d) {
        this.delete(d);
    }

    public void UnitsDaoDeleteAll() {
        this.deleteAll();
    }

}
