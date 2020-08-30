package Lesson_3.Task1;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @Column(name = "name_product")
    private String name;

    @Column(name = "cost")
    private int cost;

    @ManyToOne
    @JoinColumn(name = "product_vendor")
    private Vendor product_vendor;

    @ManyToMany
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JoinTable (
            name = "list_shop",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn (name = "id_buyer")
    )
    private List<Vendor> vendorList;

    public int getId() {
        return id;
    }

    public Vendor getProduct_vendor() {
        return product_vendor;
    }

    public void setProduct_vendor(Vendor product_vendor) {
        this.product_vendor = product_vendor;
    }

    public List<Vendor> getVendorList() {
        return vendorList;
    }

    public void setVendorList(List<Vendor> vendorList) {
        this.vendorList = vendorList;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product id: " + id + "; name: " + name + " " +
                product_vendor.toString() + "; cost: " + cost;
    }
}
