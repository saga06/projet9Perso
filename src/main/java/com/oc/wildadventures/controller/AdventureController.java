package com.oc.wildadventures.controller;

import com.oc.wildadventures.dao.AdventureDao;
import com.oc.wildadventures.model.Adventure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdventureController {

    @Autowired
    private AdventureDao adventureDao;

    //Adventures
    @GetMapping(value = "Adventures")
    public List<Adventure> listAdventures(){
        return adventureDao.findAll();
    }

    //Adventure/{id}
    @GetMapping(value = "Adventures/{id}")
    public Adventure displayAnAdventure(@PathVariable int id) {

        /*TO DELETE: JUST FOR TEST !! */
        Adventure adventure = new Adventure(id, new String("Saut en parachute"), 1, 1, 1, 100,  new String("sautez très haut!"),5);
        return adventure;
    }
}
