package org.aryan.yummy.service;

import org.aryan.yummy.entity.Product;
import org.aryan.yummy.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepository;

    public ProductService(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }

    // Save a product (create or update)
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    // Delete a product by ID
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    // Get the top 2 products in a price range
    public List<Product> getTop2ProductsInRange(Double minPrice, Double maxPrice) {
        return productRepository.findTop2ByPriceRange(minPrice, maxPrice);
    }
}
