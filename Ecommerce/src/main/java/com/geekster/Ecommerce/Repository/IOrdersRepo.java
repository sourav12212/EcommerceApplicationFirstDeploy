package com.geekster.Ecommerce.Repository;

import com.geekster.Ecommerce.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdersRepo extends JpaRepository<Orders,Integer> {
}
