package org.example.fifthExcersise.service;

import org.example.fifthExcersise.model.Order;
import org.example.fifthExcersise.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Order> getAllOrders();

    Order saveOrder(Order order);
}
