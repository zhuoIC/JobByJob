package com.example.nico.jobbyjob.pojo;

import java.util.Date;

/**
 * Created by nico on 18/11/17.
 */

public class Service {
    private int idService;
    private String name;
    private String description;
    private boolean voluntary;
    private Date creationDate;
    private Date finishDate;
    //private byte[] imagen;

    public Service(int idService, String name, String description, boolean voluntary, Date creationDate,
                   Date finishDate){//, byte[] imagen) {
        this.idService = idService;
        this.name = name;
        this.description = description;
        this.voluntary = voluntary;
        this.creationDate = creationDate;
        this.finishDate = finishDate;
        //this.imagen = imagen;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVoluntary() {
        return voluntary;
    }

    public void setVoluntary(boolean voluntary) {
        this.voluntary = voluntary;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /*public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }*/
}
