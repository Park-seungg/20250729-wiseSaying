package com.ll;

import java.time.LocalDateTime;

public class WiseSaying {
    private final int id;
    private String author;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime modifiyDate;

    public WiseSaying(int id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

    public LocalDateTime getCreateDate() {return this.createDate;}

    public LocalDateTime getModifiyDate() {return this.modifiyDate;}

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateDate(LocalDateTime createDate) {this.createDate = createDate;}

    public void setModifiyDate(LocalDateTime modifiyDate) {this.modifiyDate = modifiyDate;}
}