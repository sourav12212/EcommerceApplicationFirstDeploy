package com.geekster.Ecommerce.Controller;

import com.geekster.Ecommerce.Model.Product;
import com.geekster.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product newProduct){
        productService.addProduct(newProduct);
        return "product added";
    }

    @GetMapping("product")
    public List<Product> getProduct(){
        return productService.getProduct();
    }
}
