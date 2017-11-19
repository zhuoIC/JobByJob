package com.example.nico.jobbyjob.db.repository;

import com.example.nico.jobbyjob.pojo.User;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by nico on 18/11/17.
 */

public class UserRepository {
    private ArrayList<User> users;
    private static UserRepository userRepository;

    static {
        userRepository = new UserRepository();
    }

    private UserRepository(){
        this.users = new ArrayList<>();
        initialize();
    }

    public void initialize(){
        addUser(new User("pepe062", "pepe@hotmail.com", "Pepe",
                "Categoría con el número 1", new Date(1990,2,30),
                 "contraseña"));
        addUser(new User("KintG0", "jose@gmail.com", "Joselito",
                "Categoría con el número 1", new Date(1998,5,14),
                "contraseña"));
        addUser(new User("pabloPK", "pablo@yahoo.com", "Pablete",
                "Categoría con el número 1", new Date(1994,3,22),
                "contraseña"));
    }

    public static UserRepository getInstance(){
        if(userRepository == null)
            userRepository = new UserRepository();
        return userRepository;
    }

    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public boolean validateCredentials(String user, String password) {
        int i = 0;
        boolean isCorrect = false;
        while (i < users.size()){
            if(users.get(i).getName() == user || users.get(i).getEmail() == user){
                if(users.get(i).getPassword() == password){
                    isCorrect = true;
                }
                break;
            }
            i++;
        }
        return isCorrect;
    }
}
