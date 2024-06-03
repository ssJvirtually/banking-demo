package com.ssjvirtually.banking_demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Street cannot be blank")
    private String street;

    @NotBlank(message = "City cannot be blank")
    private String city;

    @NotBlank(message = "State cannot be blank")
    private String state;

    @NotBlank(message = "Zip code cannot be blank")
    private String zipCode;


    @NotBlank(message = "Country cannot be blank")
    private String Country;

    @ManyToOne
    private User user;

}
