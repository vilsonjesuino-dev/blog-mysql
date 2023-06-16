package com.vilson.dao;

import com.vilson.model.Comment;
import com.vilson.utils.SingleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CommentDAO {

    private Connection conn = null;

    public CommentDAO() {
        conn = SingleConnection.getConnection();
    }

    public void add(Comment comment) {

        String sql = "INSERT INTO comment (content, creationDate, idUser, idPost) VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comment.getContent());
            ps.setTimestamp(2, comment.getCreationDate());
            ps.setInt(3, comment.getIdUser());
            ps.setInt(4, comment.getIdPost());
            ps.execute();
            conn.commit();
            System.out.println("Adicionado ao Banco de Dados!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
