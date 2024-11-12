package com.mappings.controller;

import com.mappings.entity.Comments;
import com.mappings.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/comments")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public ResponseEntity<String> addComment(@RequestParam Long postId,
                                             @RequestBody Comments comments){
        Comments addedComment = commentService.addComment(postId, comments);
        return new ResponseEntity<>("Comment Added", HttpStatus.CREATED);
    }
}
