package com.myretail.service;

import com.myretail.model.Product;
import com.myretail.model.User;
import com.myretail.model.UserType;

public interface PurchaseService {

    Boolean purchase(User user, Product product);
}
