package com.geekster.Ecommerce.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserData")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @NotBlank
    private String userName;
    @Email(message = "enter valid email id")
    private String userEmail;
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-_+=<>?])[A-Za-z0-9!@#$%^&*()-_+=<>?]+$")
    private String password;
    @Pattern(regexp = "^91\\d{10}$")
    private String phoneNumber;
}
