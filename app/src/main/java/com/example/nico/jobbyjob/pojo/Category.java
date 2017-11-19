package com.example.nico.jobbyjob.pojo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by nico on 18/11/17.
 */

public class Category {
    private int idCategory;
    private String name;
    private String shortName;
    private String description;
    //private byte[] image;

    public Category(int idCategory, String name, String shortName,
                    String description){//}, byte[] image) {
        this.idCategory = idCategory;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        //this.image = image;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /*public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }*/
}
