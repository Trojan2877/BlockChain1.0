package com.blockchain10.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Block {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
