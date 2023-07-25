package org.example.fifthExcersise.controller;

import org.example.fifthExcersise.model.Order;
import org.example.fifthExcersise.service.OrderService;
import org.example.fifthExcersise.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OrderController {

    private final OrderService orderService;
    private final ProductService productService;

    @Autowired
    public OrderController(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> allOrders = orderService.getAllOrders();

        if (allOrders == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(allOrders, HttpStatus.OK);
    }

    @PostMapping("/orders/{id}")
    public ResponseEntity<HttpStatus> saveOrder(@PathVariable long id) {
        Order order = new Order();

//        order.setProductsSelected(productService.getProductById(id));

        orderService.saveOrder(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/orders/hi")
    public ResponseEntity<String> orderHi(){
        return new ResponseEntity<>("Logged in týpek!", HttpStatus.OK);
    }

}
