package com.example.cosmocatsmarketplace.domain;


import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private UUID id;
    private String name;
    private String description;
    private Integer price;
    private Category category;
}