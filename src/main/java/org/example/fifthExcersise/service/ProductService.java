package org.example.fifthExcersise.service;

import org.example.fifthExcersise.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void saveProduct(Product product);
    void deleteProductById(Long id);

}
