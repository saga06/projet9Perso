package com.oc.wildadventures.model;

import java.util.Date;

public class Adventure {

    /*Attributes*/

    private int id;
    private String name;
    private int id_categorie;
    private int id_place;
    private int id_picture;
    private float price;
 /*   private Date date_start;
    private Date date_end;*/
    private String description;
    private int number_of_participants;

    /*Contructor*/

    public Adventure(int id, String name, int id_categorie, int id_place, int id_picture, float price, /*Date date_start, Date date_end,*/ String description, int number_of_participants) {
        this.id = id;
        this.name = name;
        this.id_categorie = id_categorie;
        this.id_place = id_place;
        this.id_picture = id_picture;
        this.price = price;
      /*  this.date_start = date_start;
        this.date_end = date_end;*/
        this.description = description;
        this.number_of_participants = number_of_participants;
    }

    /* Getters and Setters*/

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId_categorie() { return id_categorie; }
    public void setId_categorie(int id_categorie) { this.id_categorie = id_categorie; }

    public int getId_place() { return id_place; }
    public void setId_place(int id_place) { this.id_place = id_place; }

    public int getId_picture() { return id_picture; }
    public void setId_picture(int id_picture) { this.id_picture = id_picture; }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

/*    public Date getDate_start() { return date_start; }
    public void setDate_start(Date date_start) { this.date_start = date_start; }

    public Date getDate_end() { return date_end; }
    public void setDate_end(Date date_end) { this.date_end = date_end; }*/

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getNumber_of_participants() { return number_of_participants; }
    public void setNumber_of_participants(int number_of_participants) { this.number_of_participants = number_of_participants; }

    /*Serialization*/

    @Override
    public String toString() {
        return "Adventure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id_categorie=" + id_categorie +
                ", id_place=" + id_place +
                ", id_picture=" + id_picture +
                ", price=" + price +
     /*           ", date_start=" + date_start +
                ", date_end=" + date_end +*/
                ", description='" + description + '\'' +
                ", number_of_participants=" + number_of_participants +
                '}';
    }
}
