package com.myretail.resourse;


import com.myretail.model.Product;
import com.myretail.model.User;
import com.myretail.service.BillingService;
import com.myretail.service.PurchaseService;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class BillingResourseTest {

    @Mock
    private PurchaseService purchaseService;
    @InjectMocks
    private BillingService billingService;

    @Mock
    UserResourse userResourse;

    public void purchaseTest() {
        String userId = "iudahjhd";
        when(userResourse.getUser(anyString())).thenReturn(User.builder().userId(userId).build());
        when(purchaseService.purchase(any(User.class), any(Product.class))).thenReturn(true);
        User user = userResourse.getUser(userId);
        purchaseService.purchase(user, Product.builder().build());
    }

    public void calculateBillTest() {
        String userId ="uujjjjj";
        when(billingService.calculateBill(anyString())).thenReturn(3.3);
        billingService.calculateBill(userId);
    }

}
