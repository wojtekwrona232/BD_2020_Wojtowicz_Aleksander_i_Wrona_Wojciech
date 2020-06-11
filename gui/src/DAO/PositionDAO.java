/*
 * Copyright (c) 2019. Wojciech Wrona
 * All rights reserved
 */

package DAO;

import EntityClasses.Position;

import java.util.List;

public class PositionDAO extends DAO<Position, Integer>{

    @Override
    public Position findById(Integer integer) {
        openCurrentSession();
        Position position = getCurrentSession().get(Position.class, integer);
        closeCurrentSession();
        return position;
    }

    @Override
    public List<Position> findAll() {
        openCurrentSession();
        List<Position> list = (List<Position>) getCurrentSession().createCriteria(Position.class).list();
        closeCurrentSession();
        return list;
    }

    public void PositionDaoSave(Position d) {
        this.save(d);
    }


    public void PositionDaoUpdate(Position d) {
        this.update(d);
    }

    public void PositionDaoDelete(Position d) {
        this.delete(d);
    }

    public void PositionDaoDeleteAll() {
        this.deleteAll();
    }

}
