package Lesson_2.repositories;

import Lesson_2.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class ProductRepository {
    List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product(1, "meat", 100),
            new Product(2, "eggs", 20),
            new Product(3, "bread", 10),
            new Product(4, "sausage", 150),
            new Product(5, "cheese", 350)
    ));

    public void addProductId(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductsId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }


}
