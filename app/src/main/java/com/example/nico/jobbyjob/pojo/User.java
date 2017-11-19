package com.example.nico.jobbyjob.pojo;

import java.util.Date;

/**
 * Created by nico on 18/11/17.
 */

public class User {
    private String idUser;
    private String email;
    private String name;
    private String aboutMe;
    private Date bithDate;
    private Date registrationDate;
    private int state;
    private String password;
    //private byte[] avatar;

    public User(String idUser, String email, String name, String aboutMe, Date bithDate, String password) { //, byte[] avatar
        this.idUser = idUser;
        this.email = email;
        this.name = name;
        this.aboutMe = aboutMe;
        this.bithDate = bithDate;
        this.registrationDate = new Date();
        this.state = 1;
        this.password = password;
        //this.avatar = avatar;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

        /*public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }*/
}
