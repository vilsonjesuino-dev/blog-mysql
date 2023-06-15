package com.vilson.dao;

import com.vilson.model.User;
import com.vilson.utils.SingleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {

    private Connection conn = null;

    public UserDAO() {
        conn = SingleConnection.getConnection();
    }

    public void addUser(User user) {

        String sql = "INSERT INTO user (name, email, password, creationDate) VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setTimestamp(4, user.getCreationDate());
            ps.execute();
            conn.commit();
            System.out.println("Adicionado ao Banco de Dados!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
