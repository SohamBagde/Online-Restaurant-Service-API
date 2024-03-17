package com.soham.restaurant.service;

import com.soham.restaurant.entity.Product;
import com.soham.restaurant.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
       return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        Optional<Product> optional = productRepository.findById(id);
        return optional.orElse(null);
    }

   public Product updateProduct(Long id, Product product) {
        if(productRepository.existsById(id)) {
            product.setId(id);
           return productRepository.save(product);
        }
        return null;
   }

   public void deleteProduct(Long id) {
        productRepository.deleteById(id);
   }
}
