package org.example.evaluations.services;

import org.example.evaluations.evaluation.models.Order;
import org.example.evaluations.evaluation.models.OrderStatus;
import org.example.evaluations.evaluation.repositories.OrderRepository;
import org.example.evaluations.evaluation.services.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class OrderServiceTests {

    @Autowired
    private OrderService orderService;

    @MockBean
    private OrderRepository orderRepository;

    @Test
    void testCreateOrder() {
        // Arrange
        Long customerId = 1L;
        Double totalAmount = 100.0;

        // Act
        Order createdOrder = orderService.createOrder(customerId, totalAmount);

        // Assert
        assertEquals(customerId, createdOrder.getCustomerId());
        assertEquals(totalAmount, createdOrder.getTotalAmount());
        assertEquals(OrderStatus.CREATED, createdOrder.getStatus());
        assertNotNull(createdOrder.getId());
        assertNotNull(createdOrder.getCreatedAt());
        assertNotNull(createdOrder.getLastUpdatedAt());
        verify(orderRepository).save(any(Order.class));
    }
}
