package org.example.fifthExcersise.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToMany(mappedBy = "Orders")
    Set<Product> productsSelected;

    public Order() {
    }

    public Order(Set<Product> productsSelected) {
        this.productsSelected = productsSelected;
    }

    public Set<Product> getProductsSelected() {
        return productsSelected;
    }

    public void setProductsSelected(Set<Product> productsSelected) {
        this.productsSelected = productsSelected;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productsSelected=" + productsSelected +
                '}';
    }
}
