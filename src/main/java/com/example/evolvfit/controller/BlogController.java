package com.example.evolvfit.controller;

import com.example.evolvfit.model.Blog;
import com.example.evolvfit.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public List<Blog> getAll()
    {
        return blogService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Blog> getById(@PathVariable("id") int id)
    {
        return blogService.getById(id);
    }

    @PostMapping("/")
    public String postBlog(@RequestBody Blog blog)
    {
        return blogService.postBlog(blog);
    }
    @PutMapping("/")
    public String update(@RequestBody Blog blog)
    {
        return blogService.update(blog);
    }
    @DeleteMapping("/{id}")
    public String delete( @PathVariable int id)
    {
        return blogService.delete(id);
    }

}

