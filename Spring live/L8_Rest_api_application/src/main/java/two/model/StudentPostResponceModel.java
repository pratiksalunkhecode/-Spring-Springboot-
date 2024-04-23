package two.model;

public class StudentPostResponceModel {

    private int id;
    private String name;
    private String address;
    private String city;


  StudentPostResponceModel(){

  }

    public StudentPostResponceModel(int id, String name, String address,String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
