package com.example.demoweb.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(Long id, String text, Date date){
        this.id = id;
        this.text = text;
        this.creationDate = date;
        this.likes = 0;
    }

    public Post(){
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId(){
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
