package com.myretail.service;


import com.myretail.service.impl.BillingServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BillingServiceImplTest {

    @InjectMocks
    BillingServiceImpl billingService;

    @Test
    public void calculateBillTest() {
        billingService.calculateBill("jdghsjdgj");
    }
}
