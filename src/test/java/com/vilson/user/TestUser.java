package com.vilson.user;

import com.vilson.dao.UserDAO;
import com.vilson.model.User;
import org.junit.Test;

import java.sql.Timestamp;

public class TestUser {

    @Test
    public void add(){

        User user = new User();
        user.setName("Marcos");
        user.setEmail("marcosrodrigues@outlook.com.br");
        user.setPassword("amigo");
        user.setCreationDate(new Timestamp(System.currentTimeMillis()));

        UserDAO dao = new UserDAO();
        dao.addUser(user);
    }
}
