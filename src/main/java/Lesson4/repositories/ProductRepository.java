package Lesson4.repositories;


import Lesson4.entites.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    List<Product> findAll();

    @Query (value = "SELECT MAX(salary), CONCAT(last_name, ', ', first_name) AS full_name\n" +
            "FROM tbl_employee\n" +
            "GROUP BY full_name\n", nativeQuery = true)
    Product productMaxCost();


    @Query (value = "SELECT MIN(cost) AS max_cost, name_product FROM product\n" +
            "GROUP BY name_product\n" +
            "ORDER BY max_cost ASC\n" +
            "LIMIT 1;", nativeQuery = true)
    Product productMinCost();



}
