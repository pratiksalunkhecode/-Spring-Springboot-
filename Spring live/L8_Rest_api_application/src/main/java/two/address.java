package two;

public class address {

    private String city;
    private String street;

    public address(String city, String street) {
        super();
        this.city = city;
        this.street = street;


    }

    public address() {
   city="delhi";
   street="street1";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

