package com.example.nico.jobbyjob.pojo;

/**
 * Created by nico on 18/11/17.
 */

public class Subcategory {
    private int idSubcategory;
    private String name;
    private String shortName;
    private String description;

    public Subcategory(int idSubcategory, String name, String shortName, String description) {
        this.idSubcategory = idSubcategory;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
    }
}
