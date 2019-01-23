package com.oc.wildadventures.dao;

import com.oc.wildadventures.model.Adventure;

import java.util.List;

public interface AdventureDao {

    public List<Adventure> findAll();
    public Adventure findById(int id);
    public Adventure save(Adventure adventure);
}
