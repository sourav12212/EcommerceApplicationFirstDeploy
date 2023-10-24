package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.Product;
import com.geekster.Ecommerce.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public void addProduct(Product newProduct) {
         productRepo.save(newProduct);
    }

    public List<Product> getProduct() {
        return productRepo.findAll();
    }
}
