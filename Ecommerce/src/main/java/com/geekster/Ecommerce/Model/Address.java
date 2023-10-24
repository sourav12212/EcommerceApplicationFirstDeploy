package com.geekster.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;
    @OneToOne
    @JoinColumn(name = "fk_userId")
    private User user;
}
