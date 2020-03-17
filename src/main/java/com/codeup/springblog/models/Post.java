package com.codeup.springblog.models;

public class Post {

    private long id;
    private String title;
    private String body;

    public Post() {
    }

    ;

    public Post(long id, String title, String body) {
        this.title = title;
        this.body = body;
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}