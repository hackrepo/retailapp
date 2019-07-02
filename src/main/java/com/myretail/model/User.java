package com.myretail.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Builder
public class User {
    private UserType userType;
    private List<Product> products;
    private String userId;
}
