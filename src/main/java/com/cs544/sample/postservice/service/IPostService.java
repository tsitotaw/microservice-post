package com.cs544.sample.postservice.service;

import com.cs544.sample.postservice.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPostService {
    Post getPostById(Long postId);
    List<Post> getAll();
    Post savePost(Post post);
}
