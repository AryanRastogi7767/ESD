package org.aryan.yummy.repository;

import org.aryan.yummy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Custom query to find top 2 products in a price range
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice ORDER BY p.price ASC")
    List<Product> findTop2ByPriceRange(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice);
}
