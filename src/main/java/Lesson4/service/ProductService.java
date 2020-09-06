package Lesson4.service;

import Lesson4.entites.Product;
import Lesson4.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product>getAllProducts () {
        List<Product> products = productRepository.findAll();
        return products.stream().collect(Collectors.toList());

    }

    public Product getProductMaxCost() {
        Product product = productRepository.productMaxCost();
        return product;
    }

    public Product getProductMinCost() {
        Product product = productRepository.productMinCost();
        return product;
    }

    public List<Product> getProductPage() {
        Page<Product> pr = productRepository.findAll(PageRequest.of(1,5));
    return pr.stream().collect(Collectors.toList());
    }

}
