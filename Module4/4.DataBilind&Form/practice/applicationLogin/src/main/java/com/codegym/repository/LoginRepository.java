package com.codegym.repository;



import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class LoginRepository {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("Nhat","nhat","nhat@codegym.vn","123456",12));
        users.add(new User("Chuong","chuong","chuong@codegym.vn","123456",14));
        users.add(new User("Mai","mai","mai@codegym.vn","123456",16));
        users.add(new User("Trang","trang","trang@codegym.vn","123456",18));
        users.add(new User("Nhung","nhung","nhung@codegym.vn","123456",20));
    }
    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
