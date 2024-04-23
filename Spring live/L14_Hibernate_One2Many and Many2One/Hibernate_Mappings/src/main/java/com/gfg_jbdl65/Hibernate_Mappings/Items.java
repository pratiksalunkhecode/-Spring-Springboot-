package com.gfg_jbdl65.Hibernate_Mappings;

import jakarta.persistence.*;

@Entity
@Table(name = "item-O2M-annotation")
public class Items {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "itemid")
    private String itemid;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total")
    private int total;


    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Items(int id, String itemid, int quantity, int total, Cart cart) {
        this.id = id;
        this.itemid = itemid;
        this.quantity = quantity;
        this.total = total;
        this.cart = cart;
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
                ", cart=" + cart +
                '}';
    }
}
