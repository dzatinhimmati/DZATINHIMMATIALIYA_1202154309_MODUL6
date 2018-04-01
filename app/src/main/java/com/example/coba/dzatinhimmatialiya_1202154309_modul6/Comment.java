package com.example.coba.dzatinhimmatialiya_1202154309_modul6;

public class Comment {

    String id;
    String username;
    String comment;
    Long timestamp;

    public Comment() {
    }

    public Comment(String id,String username, String comment, Long timestamp) {
        this.id=id;
        this.username = username;
        this.comment = comment;
        this.timestamp=timestamp;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }
}
