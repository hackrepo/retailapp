package com.myretail.service;

import com.myretail.model.Product;
import com.myretail.model.User;
import com.myretail.model.UserType;
import com.myretail.service.impl.PurchaseServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PurchaseServiceImplTest {

    @InjectMocks
    PurchaseServiceImpl purchaseService;


    @Test
    public void purchaseTest() {
        purchaseService.purchase(User.builder().build(), Product.builder().build());
    }
}
