package com.example.L8_Student_CRUD_operation.StudentEntity;


public class Student {

    private int id;
    private String name;
    private String address;
    private int roll;

    public Student(String name, String address, int roll) {

        this.name = name;
        this.address = address;
        this.roll = roll;
    }

    Student(){

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

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
