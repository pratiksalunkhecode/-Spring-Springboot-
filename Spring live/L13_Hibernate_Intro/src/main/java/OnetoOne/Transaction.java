package OnetoOne;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "transaction_one2one")
public class Transaction {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;
    @Column(name = "amount")
    private double amount;

    @OneToOne(mappedBy = "transaction")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount(int i) {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Transaction(int id, double amount, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
    }

    Transaction(){

    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", customer=" + customer +
                '}';
    }
}
