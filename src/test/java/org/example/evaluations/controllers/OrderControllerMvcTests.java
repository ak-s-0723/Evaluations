package org.example.evaluations.controllers;

import org.example.evaluations.evaluation.controllers.OrderController;
import org.example.evaluations.evaluation.models.Order;
import org.example.evaluations.evaluation.models.OrderStatus;
import org.example.evaluations.evaluation.services.IOrderService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

@WebMvcTest(OrderController.class)
public class OrderControllerMvcTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IOrderService orderService;

    @Test
    public void testGetOrderByIdWithExistingOrder() throws Exception {
        // Arrange
        Order order = new Order();
        order.setId(25L);
        order.setStatus(OrderStatus.INTRANSIT);
        order.setCustomerId(5000L);

        when(orderService.getOrderById(25L)).thenReturn(order);

        // Act & Assert
        mockMvc.perform(get("/order/25"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(25))
                .andExpect(jsonPath("$.status").value("INTRANSIT"))
                .andExpect(jsonPath("$.customerId").value(5000L));
    }
}
