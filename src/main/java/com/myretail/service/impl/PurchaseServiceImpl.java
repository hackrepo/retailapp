package com.myretail.service.impl;

import com.myretail.model.Product;
import com.myretail.model.User;
import com.myretail.model.UserType;
import com.myretail.service.PurchaseService;
import org.springframework.stereotype.Component;

@Component
public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public Boolean purchase(User user, Product product) {

        //logic will contain to set the product purchase detail to DB
        return null;
    }
}
