package org.example.fifthExcersise.service.impl;

import org.example.fifthExcersise.model.Product;
import org.example.fifthExcersise.repository.ProductRepository;
import org.example.fifthExcersise.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> allProducts = productRepository.findAll();

        if (allProducts.isEmpty()){
            return null;
        }
        return allProducts;
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);

        return product.orElse(null);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }


}
