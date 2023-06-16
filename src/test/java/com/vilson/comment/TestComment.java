package com.vilson.comment;

import com.vilson.dao.CommentDAO;
import com.vilson.model.Comment;
import org.junit.Test;

import java.sql.Timestamp;

public class TestComment {

    @Test
    public void addComment() {

        Comment comment = new Comment();
        comment.setContent("Ótimo post! Eu estava procurando exatamente essas informações");
        comment.setCreationDate(new Timestamp(System.currentTimeMillis()));
        comment.setIdUser(5);
        comment.setIdPost(1);

        CommentDAO dao = new CommentDAO();
        dao.add(comment);
    }
}
