package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.exceptions.ShortInventoryException_;
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
    private ItemRepo_ itemRepo;

    @Autowired
    private InventoryRepo_ inventoryRepo;

    @Autowired
    private OrderRepo_ orderRepo;

    @Autowired
    private OrderStateTimeMappingRepo_ orderStateTimeMappingRepo;

    public Order_ createOrder(Map<Long,Long> itemQuantityMap, Long customerId) throws ShortInventoryException_ {
        Order_ order = new Order_();
        Order_ persistedOrder = orderRepo.save(order);

        Double totalCost = 0D;
        for(Map.Entry<Long,Long> mapElement : itemQuantityMap.entrySet()) {
            Long productId = mapElement.getKey();
            Long quantity = mapElement.getValue();
            Item_ item = itemRepo.findById(productId).get();
            ItemDetail_ itemDetail = new ItemDetail_();
            itemDetail.setItem(item);
            itemDetail.setQuantity(quantity);
            itemDetail.setOrder(persistedOrder);
            Inventory_ inventory = inventoryRepo.findByItem(item).get();
            Double count = inventory.getCount();
            if(count < quantity) {
                throw new ShortInventoryException_("Ordered Quantity is not Available");
            }
            inventory.setCount(count-quantity);
            totalCost = totalCost + (item.getPrice() * quantity);
            inventoryRepo.save(inventory);
            itemDetailRepo.save(itemDetail);
        }

        OrderStateTimeMapping_ orderStateTimeMapping = new OrderStateTimeMapping_();
        orderStateTimeMapping.setOrder(persistedOrder);
        orderStateTimeMappingRepo.save(orderStateTimeMapping);

        Customer_ customer = customerRepo.findById(customerId).get();
        persistedOrder.setCustomer(customer);
        persistedOrder.setTotalCost(totalCost);
        persistedOrder = orderRepo.save(persistedOrder);
        return persistedOrder;
    }
}
