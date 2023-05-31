package com.proxy.task.notes.entities;

import java.time.ZonedDateTime;
import java.util.List;

public class Note implements INote {

    private String subject;

    private String content;

    private List<ILike> likes;

    private ZonedDateTime creationTime;

    private ZonedDateTime lastEditedTime;

    public Note(String subject, String content, List<ILike> likes, ZonedDateTime creationTime,
                ZonedDateTime lastEditedTime) {
        this.subject = subject;
        this.content = content;
        this.likes = likes;
        this.creationTime = creationTime;
        this.lastEditedTime = lastEditedTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<ILike> getLikes() {
        return likes;
    }

    public void setLikes(List<ILike> likes) {
        this.likes = likes;
    }

    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(ZonedDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public ZonedDateTime getLastEditedTime() {
        return lastEditedTime;
    }

    public void setLastEditedTime(ZonedDateTime lastEditedTime) {
        this.lastEditedTime = lastEditedTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
