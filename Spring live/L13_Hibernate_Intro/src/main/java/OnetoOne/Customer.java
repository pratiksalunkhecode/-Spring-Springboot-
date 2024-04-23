package OnetoOne;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_one2one")
public class Customer {

    @Id
    @Column(name = "id")

    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Transaction transaction;

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

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Customer(int id, String name, String address, Transaction transaction) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.transaction = transaction;
    }

    Customer(){

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}
