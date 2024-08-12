# Understanding Model View Controller (MVC) pattern by implementing CreateOrder Api

## This project contains OrderController, OrderService and OrderRepository. You need to add implementation wherever mentioned below in requirements or in Code comments.
### Please make sure you have solved 2nd Assignment before coming to this.

## Requirements

1. Please read about MVC Pattern if you don't know.
2. In OrderController, you need to implement POST Api which will accept body in form of `OrderRequestDto` and will return created `Order`.
3. This API will call `createOrder` method present inside `IOrderService`.
4. You need to add implementation for `createOrder` method in `OrderService`
      - set TotalOrderAmount & CustomerId to whatever passed in request.
      - set OrderStatus to `CREATED`
      - CreatedAt and LastUpdatedAt should current Date value (you might have to use default constructor of Date class)
      - Id can be any random UUID
      - Persist created Order in `OrderRepository` by calling  it's save method
      - Return this created Order.
5. IOrderService and OrderRepository are complete, you need not to do anything inside them. Just take a look at them to better understand flow of code.
6. You need to add SpringBoot Annotation like `@Service` in OrderService class to make sure Spring creates Bean for it.

## Hints
1. You don't need to create any new file.
2. Dependencies are added in each class, please don't remove or edit them.
3. If you will try to run testcases without adding solution, multiple Testcases will fail with different errors.
4. Please don't change anything in files present inside `models`, `dtos` and `repositories` package. 