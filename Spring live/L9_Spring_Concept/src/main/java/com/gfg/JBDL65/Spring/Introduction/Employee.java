package com.gfg.JBDL65.Spring.Introduction;

public class Employee {

   private int id;
   private String name;
   private double sal;
   private Address address;

   public Employee(){

   }

    public Employee(int id, String name, double sal, Address address) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.address = address;
    }

    public Employee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", address=" + address +
                '}';
    }
}
