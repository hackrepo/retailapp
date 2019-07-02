package com.myretail.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class Product {
    private String name;
    private Integer price;
}
