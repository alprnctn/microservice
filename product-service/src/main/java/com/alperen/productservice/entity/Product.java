package com.alperen.productservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Document(value = "product")
public class Product {

    @Id
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

}
