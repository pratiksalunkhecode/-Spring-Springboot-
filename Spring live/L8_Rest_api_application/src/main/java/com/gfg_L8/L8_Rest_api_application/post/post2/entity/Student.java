package com.gfg_L8.L8_Rest_api_application.post.post2.entity;

public class Student {

    private int id;
    private String name;
    private int roll;

    public Student(int id, String name, int roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
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

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roll=" + roll +
                '}';

        /*
        The toString() method in Java converts an object into a text form.
        It's like asking the object to describe itself in words.
        By default, it gives basic information about the object,
         but you can customize it to provide more useful details.
         */
    }
}
