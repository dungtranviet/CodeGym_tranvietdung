package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>  users;
    static {
        users=new ArrayList<>();
        users.add(new User("Dung","123","dung","dung@gmail.com",32));
        users.add(new User("Toan","123","toan","toan@gmail.com",32));
        users.add(new User("Tuan","123","tuan","tuan@gmail.com",32));
        users.add(new User("Huy","123","huy","huy@gmail.com",32));
    }
    public static User checkLogin(Login login){
        for (User user:users) {
            if(user.getAccount().equals(login.getAccount())&&user.getPassword().equals(login.getPassword()))
            {
                return user;
            }
        }
        return null;
    }

}

