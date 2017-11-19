package com.example.nico.jobbyjob.pojo;

/**
 * Created by nico on 18/11/17.
 */

public class Assesment {
    private int idAssesment;
    private String tittle;
    private String content;
    private boolean positive;

    public Assesment(int idAssesment, String tittle, String content, boolean positive) {
        this.idAssesment = idAssesment;
        this.tittle = tittle;
        this.content = content;
        this.positive = positive;
    }

    public int getIdAssesment() {
        return idAssesment;
    }

    public void setIdAssesment(int idAssesment) {
        this.idAssesment = idAssesment;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }
}
