package com.cs544.sample.postservice.service;

import com.cs544.sample.postservice.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cs544.sample.postservice.repository.IPostRepository;

import java.util.List;

@Service
public class PostService implements IPostService{
    @Autowired
    private IPostRepository postRepository;

    @Override
    public Post getPostById(Long postId) {
        return postRepository.findById(postId).get();
    }

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}
