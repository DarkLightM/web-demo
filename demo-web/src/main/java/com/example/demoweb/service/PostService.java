package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>() {{
        add(new Post(0L, "First post", new Date()));
        add(new Post(1L,"«Second post", new Date()));
        add(new Post(2L,"Third post", new Date()));
    }};

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size() + 1, text, new Date()));
    }
}
