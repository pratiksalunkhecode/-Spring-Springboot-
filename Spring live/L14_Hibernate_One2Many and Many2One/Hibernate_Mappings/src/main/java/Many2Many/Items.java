package Many2Many;

import jakarta.persistence.*;

@Entity
@Table(name = "item-M2M-annotation")
public class Items {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "itemid")
    private String itemid;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total")
    private int total;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = String.valueOf(itemid);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = Integer.parseInt(quantity);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    public Items(int id, String itemid, int quantity, int total) {
        this.id = id;
        this.itemid = itemid;
        this.quantity = quantity;
        this.total = total;

    }

    Items(){

    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", itemid=" + itemid +
                ", quantity='" + quantity + '\'' +
                ", total=" + total +
                '}';
    }
}
