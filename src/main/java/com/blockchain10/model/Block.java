package com.blockchain10.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Block {

    @Id
    private String id;

    private String next;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
