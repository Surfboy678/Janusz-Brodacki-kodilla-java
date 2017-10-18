package com.kodilla.hibernate1.invoice;

import javax.persistence.*;
import java.math.BigDecimal;

public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;
    private Product product;

    public Item( BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;

    }
    public Item(){

    }
    @Id
    @GeneratedValue
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name="PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @Column(name="QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Column(name="VALUE")
    public BigDecimal getValue() {
        return value;
    }
    @ManyToOne(cascade = CascadeType.ALL,
                fetch = FetchType.EAGER)
    @JoinColumn(name="PRODUCT_ID")
    public Product getProduct() {
        return product;
    }
    @Column(name="INVOICE")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
