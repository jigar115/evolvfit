package com.example.evolvfit.service;

import com.example.evolvfit.model.Blog;
import com.example.evolvfit.model.Comment;
import com.example.evolvfit.repository.BlogRepository;
import com.example.evolvfit.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Autowired
    CommentRepository commentRepository;

    public List<Blog> getAll() {
        return (List<Blog>) blogRepository.findAll();
    }

    public Optional<Blog> getById(int id) {
        return blogRepository.findById(id);
    }
    public String postComment(Comment comment)
    {
        if(commentRepository.save(comment)!=null)
        {
            return "Added Sucsessfully";
        }
        else {
            return "Somthig went Wrong";
        }
    }

    public String postBlog(Blog blog) {
        if(blogRepository.save(blog)!=null)
        {
            return "Added Sucsessfully";
        }
        else {
            return "Somthig went Wrong";
        }
    }
    public String update(Blog blog) {
        if(blogRepository.save(blog)!=null)
        {
            return "Update Sucsessfully";
        }
        else {
            return "Somthig went Wrong";
        }
    }

    public String delete(int id) {
        try {
            blogRepository.deleteById(id);
            commentRepository.deleteComments(id);
            return "Sucessfull";

        }
        catch (IllegalArgumentException e)
        {
            return "Somthig went Wrong";
        }

    }

    public List<Comment> getComment(int id) {
        return commentRepository.findByIdOfBlog(id);
    }

    public String deleteComment(int idOfBlog) {
        try {
            commentRepository.deleteComments(idOfBlog);
            return "Sucessfull";

        }
        catch (IllegalArgumentException e)
        {
            return "Somthig went Wrong";
        }
    }
}
