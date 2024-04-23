package com.example.L8_Student_CRUD_operation.Model;

public class StudentResponceModel {

    private int id;
    private String name;
    private String address;

    public StudentResponceModel(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }


    StudentResponceModel(){

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
