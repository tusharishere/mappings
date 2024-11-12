package com.mappings.service;

import com.mappings.entity.Post;
import com.mappings.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post){
        Post savedPost = postRepository.save(post);
        return savedPost;
    }
}
