package com.gfg_JBDL65.Order_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class OrderProduct {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public OrderProduct(int id, String name) {
        this.id = id;
        this.name = name;
    }

    OrderProduct(){

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


}
