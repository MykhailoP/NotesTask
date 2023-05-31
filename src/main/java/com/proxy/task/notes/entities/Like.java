package com.proxy.task.notes.entities;

import java.time.ZonedDateTime;

public class Like implements ILike {

    private IUser user;

    private ZonedDateTime dateTime;

    public IUser getUser() {
        return user;
    }

    public void setUser(IUser user) {
        this.user = user;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
