package com.fawry.demo.service;

import com.fawry.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product addProduct(Product product);
    List<Product> getAll();
    Product getProduct(Long id);
    Product updateProduct(Long productId , Product product);
    void updateProductQuantity(Long productId, Long quantity);
    void deleteProduct(Long productId);
    List<Product> getProductsByPopularity();
}
