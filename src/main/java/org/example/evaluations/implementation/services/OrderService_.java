package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.exceptions.OrderNotFoundException_;
import org.example.evaluations.implementation.models.*;
import org.example.evaluations.implementation.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService_ implements IOrderService_ {
    @Autowired
    private CustomerRepo_ customerRepo;

    @Autowired
    private ItemDetailRepo_ itemDetailRepo;

    @Autowired
    private InventoryRepo_ inventoryRepo;

    @Autowired
    private OrderRepo_ orderRepo;

    @Autowired
    private OrderStateTimeMappingRepo_ orderStateTimeMappingRepo;

    public Boolean cancelOrder(Long orderId) throws OrderNotFoundException_ {
        Optional<Order_> orderOptional = orderRepo.findById(orderId);
        if(orderOptional.isEmpty()) {
            throw new OrderNotFoundException_("orderId is wrong");
        }

        Order_ order = orderOptional.get();
        List<ItemDetail_> itemDetails = itemDetailRepo.findByOrder(order); //itemDetails is not null
        for(ItemDetail_ itemDetail : itemDetails) {
            Item_ item = itemDetail.getItem(); //item is not null
            Inventory_ inventory = inventoryRepo.findByItem(item).get();
            Double count = inventory.getCount();
            inventory.setCount(count+itemDetail.getQuantity());
            inventoryRepo.save(inventory);
            itemDetailRepo.deleteById(itemDetail.getId());
        }

        OrderStateTimeMapping_ orderStateTimeMapping = new OrderStateTimeMapping_();
        orderStateTimeMapping.setOrderState(OrderState_.CANCELLED);
        orderStateTimeMapping.setOrder(order);
        orderStateTimeMappingRepo.save(orderStateTimeMapping);

        Customer_ customer = order.getCustomer();
        Long cancellationCount = customer.getOrderCancellationCount();
        customer.setOrderCancellationCount(cancellationCount+1);
        customerRepo.save(customer);
        return true;
    }
}
