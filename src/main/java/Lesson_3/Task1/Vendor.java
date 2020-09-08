package Lesson_3.Task1;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendor")
    private int id;

    @Column(name = "vendor_name")
    private String vendor_name;

    @OneToMany (mappedBy = "product_vendor")
    private List<Product> products;


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    @Override
    public String toString() {
        return vendor_name + "(" + id + ")";
    }
}
