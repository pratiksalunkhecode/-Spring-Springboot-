package com.gfg_l16_MSOA.MSOA_Iteam_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class item {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @Override
    public String toString() {
        return "item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public item(){

    }
}
