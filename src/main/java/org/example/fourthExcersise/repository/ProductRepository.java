package org.example.fourthExcersise.repository;

import org.example.fourthExcersise.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository{
    private List<Product> productList = new ArrayList<Product>();

    public List<Product> getAllProducts(){
        return productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public Product getProductById(long id){
        for (Product product : productList){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public Product deleteProductById(long id){
        for (Product product : productList){
            if (product.getId() == id){
                productList.remove(id);
                return null;
            }
        }
        return null;
    }

    public void editProductById(Product productEdit, long id){
        for (Product product : productList){
            if (product.getId() == id){
                productList.remove(product);
            }
        }
        addProduct(productEdit);
    }
}
