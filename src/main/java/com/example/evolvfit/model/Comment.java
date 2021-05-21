package com.example.evolvfit.model;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    public Comment(int id, int idOfBlog, String data, String postDate) {
        this.id = id;
        this.idOfBlog = idOfBlog;
        this.data = data;
        this.postDate = postDate;
    }
    public Comment()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idOfBlog;
    private String data;
    private String postDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOfBlog() {
        return idOfBlog;
    }

    public void setIdOfBlog(int idOfBlog) {
        this.idOfBlog = idOfBlog;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

}
