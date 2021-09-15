package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public static List<Post> listAllPosts(){
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("First post"));
        posts.add(new Post("Second post"));
        posts.add(new Post("Third post"));
        return posts;
    }
}
