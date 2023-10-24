package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.Address;
import com.geekster.Ecommerce.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public String addAddress(Address newAddress) {
         addressRepo.save(newAddress);
         return "address added";
    }
}
