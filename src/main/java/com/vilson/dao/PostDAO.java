package com.vilson.dao;

import com.vilson.model.Post;
import com.vilson.utils.SingleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PostDAO {

    private Connection conn = null;

    public PostDAO() {
        conn = SingleConnection.getConnection();
    }

    public void addPost(Post post) {

        String sql = "INSERT INTO post(title, content, creationDate, idUser) VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, post.getTitle());
            ps.setString(2, post.getContent());
            ps.setTimestamp(3, post.getCreationDate());
            ps.setInt(4, post.getIdUser());
            ps.execute();
            conn.commit();
            System.out.println("Adicionado ao Bando de Dados!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
