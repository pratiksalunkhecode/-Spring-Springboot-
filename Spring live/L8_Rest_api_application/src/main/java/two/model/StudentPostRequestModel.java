package two.model;

public class StudentPostRequestModel {

    private String name;
    private String address;
    private String city;


    public StudentPostRequestModel(String name, String address,String city) {
        this.name = name;
        this.address = address;
        this.city=city;
    }

    StudentPostRequestModel(){

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
