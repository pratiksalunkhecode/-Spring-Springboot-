package com.example.L8_Student_CRUD_operation.Model;

public class StudentRequestModel {

    private String name;
    private String address;
    private int roll;


    public StudentRequestModel(String name, String address, int roll) {
        this.name = name;
        this.address = address;
        this.roll = roll;
    }

    StudentRequestModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
