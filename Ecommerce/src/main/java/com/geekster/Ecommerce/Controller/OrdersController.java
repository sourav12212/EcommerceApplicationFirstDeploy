package com.geekster.Ecommerce.Controller;

import com.geekster.Ecommerce.Model.Orders;
import com.geekster.Ecommerce.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @PostMapping("order")
    public String placeAnOrder(@RequestBody Orders orders)
    {
        return ordersService.placeAnOrder(orders);
    }

    @GetMapping("orders")
    public List<Orders> getAllOrders()
    {
        return ordersService.getAllOrders();
    }
    @GetMapping("Order/{id}")
    public Optional<Orders> getOrderById(@PathVariable Integer id)
    {
        return ordersService.getOrderById(id);
    }

    @DeleteMapping("order/{id}")
    public String deleteOrderById(@PathVariable Integer id)
    {
        return ordersService.deleteOrderById(id);
    }
}
