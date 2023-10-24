package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.Orders;
import com.geekster.Ecommerce.Repository.IOrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    @Autowired
    IOrdersRepo ordersRepo;

    public Optional<Orders> getOrderById(Integer id){
        return ordersRepo.findById(id);
    }

    public String placeAnOrder(Orders order){
        ordersRepo.save(order);
        return "Order Placed :) !";
    }

    public List<Orders> getAllOrders(){
        return (List<Orders>) ordersRepo.findAll();
    }

    public String deleteOrderById(Integer id){
        ordersRepo.deleteById(id);
        return "Order Cancelled :( !";
    }

}
