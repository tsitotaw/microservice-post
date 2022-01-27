package com.cs544.sample.postservice.bootstrap;

import com.cs544.sample.postservice.model.Post;
import com.cs544.sample.postservice.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrapper implements CommandLineRunner {
    @Autowired
    private IPostService postService;

    @Override
    public void run(String... args) throws Exception {
        this.postService.savePost(new Post(null,"My First Post", "The following is what I thought is right!"));
        this.postService.savePost(new Post(null,"My Second Post", "My Second post is much better than my first! Yay!"));
    }
}
