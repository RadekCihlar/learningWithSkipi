package org.example.fifthExcersise.controller;

import org.example.fifthExcersise.service.ProductService;
import org.example.fifthExcersise.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();

        if (allProducts == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> insertProduct(@RequestBody Product product) {
        productService.saveProduct(product);

        System.out.println(product);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        Product product = productService.getProductById(id);

        if (product == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<HttpStatus> deleteProductById(@PathVariable long id) {
        productService.deleteProductById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @PutMapping("/products/{id}")
//    public ResponseEntity<HttpStatus> editProductById(@PathVariable long id, @RequestBody Product product) {
//        productService.updateProductById(id, product);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
