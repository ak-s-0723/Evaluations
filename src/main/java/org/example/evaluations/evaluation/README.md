# Understanding Model View Controller (MVC) pattern by implementing GetOrderById Api 

## This project contains OrderController, OrderService and OrderRepository. You need to add implementation wherever mentioned below in requirements or in Code comments.

## Requirements

1. Please read about MVC Pattern if you don't know.
2. In OrderController, you need to implement GET Api with path `/order/{orderId}` which will return `Order` corresponding to particular orderId.
3. This API will call getOrderById method present inside IOrderService.
4. IOrderService and OrderService are complete, you need not to do anything inside them. Just take a look at them to better understand flow of code.
5. In OrderRepository, you need to complete findById method, where you will use get() method of Map.
6. You need to add SpringBoot Annotations like `@RestController` in OrderController class and `@Repository` in OrderRepository class to make sure Spring creates Bean for them.

## Hints
1. You don't need to create any new file.
2. Dependencies are added in each class, please don't remove or edit them.
3. If you will try to run testcases without adding solution, multiple Testcases will fail with different errors.
4. Please don't change anything in files present inside `models` and `services` package. 