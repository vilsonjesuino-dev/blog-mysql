package com.vilson.post;

import com.vilson.dao.PostDAO;
import com.vilson.model.Post;
import org.junit.Test;

import java.sql.Timestamp;

public class TestPost {

    @Test
    public void add() {

        Post post = new Post();
        post.setTitle("Os 10 principais frameworks de desenvolvimento web em 2023");
        post.setContent("Neste post, exploraremos os 10 principais frameworks " +
                "de desenvolvimento web que estão em alta neste ano. " +
                "Discutiremos suas principais características, vantagens " +
                "e casos de uso. Se você está procurando uma maneira eficiente " +
                "de construir aplicações web modernas, este artigo é para você!");
        post.setCreationDate(new Timestamp(System.currentTimeMillis()));
        post.setIdUser(5);

        PostDAO dao = new PostDAO();
        dao.addPost(post);
    }
}
