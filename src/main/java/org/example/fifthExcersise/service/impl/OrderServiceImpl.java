package org.example.fifthExcersise.service.impl;

import org.example.fifthExcersise.model.Order;
import org.example.fifthExcersise.model.Product;
import org.example.fifthExcersise.repository.OrderRepository;
import org.example.fifthExcersise.repository.ProductRepository;
import org.example.fifthExcersise.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    private final ProductRepository productRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        List<Order> allOrders = orderRepository.findAll();

        if (allOrders.isEmpty()) {
            return null;
        }
        return allOrders;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }


}
