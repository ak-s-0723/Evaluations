package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.exceptions.ShortInventoryException_;
import org.example.evaluations.implementation.models.Order_;

import java.util.Map;

public interface IOrderService_ {
    Order_ createOrder(Map<Long,Long> itemQuantityMap, Long customerId) throws ShortInventoryException_;
}
