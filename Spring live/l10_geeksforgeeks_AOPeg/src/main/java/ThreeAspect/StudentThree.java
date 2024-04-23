package ThreeAspect;

public class StudentThree {


    private String name;
    private String address;

    public StudentThree(String name, String address) {

        this.name = name;
        this.address = address;
    }

    StudentThree(){

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

    @Override
    public String toString() {
        return "Student{" +

                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void Exception(){
        System.out.println("Exception will be throw");
        throw new IllegalArgumentException();

    }
}
