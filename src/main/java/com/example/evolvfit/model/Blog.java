package com.example.evolvfit.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name ="blog")
public class Blog {
    public Blog(int id, String title, String data, String postDate) {
        this.id = id;
        this.title = title;
        this.data = data;
        this.postDate = postDate;
    }
    public Blog(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String data;
    private String postDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTital() {
        return title;
    }

    public void setTital(String tital) {
        this.title = tital;
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
