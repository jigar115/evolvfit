package com.example.evolvfit.controller;

import com.example.evolvfit.model.Comment;
import com.example.evolvfit.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    BlogService blogService;

    @PostMapping("/")
    public String post(Comment comment)
    {
        return blogService.postComment(comment);
    }
    @GetMapping("/{id}")
    public List<Comment> getComment(@PathVariable int id)
    {
        return blogService.getComment(id);
    }
    @DeleteMapping("/{idOfBlog}")
    public String deleteComment(@PathVariable int idOfBlog)
    {
        return blogService.deleteComment(idOfBlog);
    }
}
