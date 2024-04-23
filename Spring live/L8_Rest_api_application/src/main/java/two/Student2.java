package two;

public class Student2 {


    private int id;
    private String name;
    private String address;
    private address add;
    private int roll;

    Student2(){

    }

    public Student2(int id, String name, String address, int roll) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public two.address getAdd() {
        return add;
    }

    public void setAdd(address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", roll=" + roll +
                '}';
    }
}

