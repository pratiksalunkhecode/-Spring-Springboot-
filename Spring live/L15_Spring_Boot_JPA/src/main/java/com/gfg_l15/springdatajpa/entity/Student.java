package com.gfg_l15.springdatajpa.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "sb-jpa-student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "roll")
    private int roll;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Student(int id, String name, String email, int roll) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roll = roll;
    }

    public Student(){

    }
}
