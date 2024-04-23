package com.gfg_L8.L8_Rest_api_application.post.post2.model;

public class StudentPostRequestModel {

    private String name;
    private int roll;

    public StudentPostRequestModel(int id, String name, int roll) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
