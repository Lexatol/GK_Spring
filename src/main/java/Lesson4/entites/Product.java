package Lesson4.entites;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table (name = "product")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_product")
    private int id_product;

    @Column (name = "name_product")
    private String name_product;

    @Column (name = "cost")
    private int cost;


    public Product() {
    }

    public Product(int id_product, String name_product, int cost) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.cost = cost;
    }
}