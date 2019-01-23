package com.oc.wildadventures.dao;

import com.oc.wildadventures.model.Adventure;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdventureDaoImpl implements AdventureDao {

    /*TO DELETE JUST FOR TEST !!*/
    public static List<Adventure> adventures = new ArrayList<>();

    static {
        adventures.add(new Adventure(1, new String("Saut en parachute"), 1, 1, 1, 100,  new String("sautez très haut!"),5));
        adventures.add(new Adventure(2, new String("Vol en mongolfière"), 1, 2, 2, 200,  new String("envolez-vous!"),2));
        adventures.add(new Adventure(3, new String("Baptême d'hélicoptère"), 1, 3, 3, 150,  new String("prêt pour le baptême"),4));
    }
    /* END TO DELETE !!! NOT AFTER */

    @Override
    public List<Adventure> findAll() {
        return adventures;
    }

    @Override
    public Adventure findById(int id) {
        return null;
    }

    @Override
    public Adventure save(Adventure adventure) {
        return null;
    }
}
