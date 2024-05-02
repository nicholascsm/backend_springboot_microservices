package com.niche.microservices.orderservice.service;

import com.niche.microservices.orderservice.dto.OrderRequest;
import com.niche.microservices.orderservice.model.Order;
import com.niche.microservices.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        // map OrderRequest to order object
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());

        //save order to OrderRepo
        orderRepository.save(order);
    }
}
