package com.l10_geeksforgeeks_JDBC65.l10_geeksforgeeks_AOPeg;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(){

    }

    public void Exception(){
        System.out.println("Exception will be throw");
        throw new IllegalArgumentException();

    }


}
