package Lesson_2.service;

import Lesson_2.entites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Lesson_2.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductId(int id) {
        return productRepository.getProductsId(id);
    }

    public List<Product> getProducts() {
        return productRepository.getProductList();
    }

    public void addProducts (Product product) {
        productRepository.addProductId(product);
    }

}
