package org.example.fourthExcersise.controller;

import org.example.fourthExcersise.model.Product;
import org.example.fourthExcersise.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllproducts(){
        List<Product> allProducts = productRepository.getAllProducts();

        if (allProducts.isEmpty()){
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> insertProduct(@RequestBody Product product){
        productRepository.addProduct(product);

        System.out.println(product);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id){
        Product product = productRepository.getProductById(id);

        if (product == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<HttpStatus> deleteProductById(@PathVariable long id){
        productRepository.deleteProductById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<HttpStatus> editProductById(@PathVariable long id, @RequestBody Product product){
        productRepository.editProductById(product, id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
