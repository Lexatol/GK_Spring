package Lesson_3.Task1;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbuyer")
    private int id;

    @Column(name = "namebuyer")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "list_shop",
            joinColumns = @JoinColumn(name = "id_buyer"),
            inverseJoinColumns = @JoinColumn(name = "id_product")
    )
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
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

    @Override
    public String toString() {
        String allProduct = "";
        for (Product pr : productList) {
            allProduct += pr.getName() + " ";
        }
        return "Buyer: " + name + ": id" + id + "; List products: " + allProduct;
    }
}
