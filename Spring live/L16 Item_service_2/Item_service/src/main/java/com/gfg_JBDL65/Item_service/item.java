package com.gfg_JBDL65.Item_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class item {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    item(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
