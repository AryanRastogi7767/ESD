package org.aryan.yummy.mapper;

import org.aryan.yummy.dto.ProductRequest;
import org.aryan.yummy.dto.ProductResponse;
import org.aryan.yummy.entity.Product;
import org.springframework.stereotype.Service;

@Service

public class ProductMapper {
    public Product toEntity(ProductRequest request) {
        return Product.builder()
                .name(request.name())
                .price(request.price())
                .build();
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
                product.getName(),
                product.getPrice()
                );
    }
}
