package com.example.cosmocatsmarketplace.service;

import com.example.cosmocatsmarketplace.domain.Product;
import com.example.cosmocatsmarketplace.dto.ProductResponseDto;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(UUID productId);

    Product createProduct(ProductResponseDto product);

    Product updateProduct(ProductResponseDto product);

    void deleteProductById(UUID id);
}