package com.fawry.demo.service.impl;

import com.fawry.demo.repository.entity.Product;
import com.fawry.demo.repository.ProductRepository;
import com.fawry.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
   private ProductRepository productRepository;

    public Product addProduct(Product product){
        return  productRepository.save(product);
    }

    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> {
            return new IllegalArgumentException("this product dose not exist");
        });
    }

    public Product updateProduct(Long productId , Product product) {
        Product product1 = productRepository.findById(productId).orElseThrow(() -> {
            return new IllegalArgumentException("this product dose not exist");
        });

        product1.setNameEn(product.getNameEn());
        product1.setNameAr(product.getNameAr());
        product1.setPrice(product.getPrice());
        product1.setQuantity(product.getQuantity());
        product1.setImage(product.getImage());

        productRepository.save(product1);
        return product1;
    }

    public void updateProductQuantity(Long productId, Long quantity){
        Optional<Product> product1 = productRepository.findById(productId);
        if (product1.isPresent()) {
            Product product = product1.get();

            product.setQuantity(product.getQuantity() - quantity);
            productRepository.save(product);
        }
    }

    public void deleteProduct(Long productId) {
         productRepository.deleteById(productId);
    }

    public List<Product> getProductsByPopularity(){
        return productRepository.getProductByBuyingCounter();
    }

}


