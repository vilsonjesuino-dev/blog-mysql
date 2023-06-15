package com.vilson.user;

import com.vilson.dao.UserDAO;
import com.vilson.model.User;
import org.junit.Test;

import java.sql.Timestamp;

public class add {

    @Test
    public void addUserTest(){

        User user = new User();
        user.setName("Vilson");
        user.setEmail("vilson@outlook.com.br");
        user.setPassword("admin");
        user.setCreationDate(new Timestamp(System.currentTimeMillis()));

        UserDAO dao = new UserDAO();
        dao.addUser(user);
    }
}
