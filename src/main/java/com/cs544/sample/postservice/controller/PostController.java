package com.cs544.sample.postservice.controller;

import com.cs544.sample.postservice.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cs544.sample.postservice.service.IPostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private IPostService postService;

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") Long postId){
        return this.postService.getPostById(postId);
    }

    @GetMapping("")
    public List<Post> getAllPosts(){
        return this.postService.getAll();
    }

    @PostMapping("")
    public Post savePost(@RequestBody Post post){
        return this.postService.savePost(post);
    }
}
