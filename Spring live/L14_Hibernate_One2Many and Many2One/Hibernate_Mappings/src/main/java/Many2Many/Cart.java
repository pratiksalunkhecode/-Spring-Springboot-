package Many2Many;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "cart_M2M_annotation")
public class Cart {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name="total")
    private int total;


    @ManyToMany(targetEntity = Items.class)
    @JoinTable(name="Cart_item_Mapping_Annotation",
            joinColumns = {@JoinColumn(name="cart_id")},
            inverseJoinColumns = {@JoinColumn(name="item_id")})
    private Set<Items> items;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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

    public Set<Items> getItems() {
        return items;
    }

    public void setItems(Set<Items> items) {
        this.items = items;
    }

    public Cart(int id, String name, int total, Set<Items> items) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.items = items;
    }

    Cart(){

    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total=" + total +
                ", items=" + items +
                '}';
    }
}
