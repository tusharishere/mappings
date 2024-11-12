package com.mappings.service;

import com.mappings.entity.Comments;
import com.mappings.entity.Post;
import com.mappings.repository.CommentsRepository;
import com.mappings.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private CommentsRepository commentsRepository;
    private PostRepository postRepository;

    public CommentService(CommentsRepository commentsRepository, PostRepository postRepository) {
        this.commentsRepository = commentsRepository;
        this.postRepository = postRepository;
    }
    public Comments addComment(Long postId,Comments comments){
        Post post = postRepository.findById(postId).get();
        comments.setPost(post);
        Comments savedComment = commentsRepository.save(comments);
        return savedComment;
    }
}
