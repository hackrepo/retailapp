package com.myretail.resourse;


import com.myretail.model.Product;
import com.myretail.model.User;
import com.myretail.model.UserType;
import com.myretail.service.BillingService;
import com.myretail.service.PurchaseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BillingResourse {

    @Autowired
    private PurchaseService purchaseService;
    @Autowired
    private BillingService billingService;

    @Autowired
    private UserResourse userResourse;


    @ApiOperation("API to add the purchase details for a user")
    @RequestMapping(value = "/purchase/{userId}", method = RequestMethod.POST)
    Boolean purchase(@RequestBody Product product, @PathVariable("userId") String userId) {

        User user = userResourse.getUser(userId);
        return purchaseService.purchase(user, product);
    }

    @ApiOperation("API to calculate the bill of given user.")
    @RequestMapping(value = "/bill{userId}", method = RequestMethod.GET)
    Double calculateBill(@PathVariable("userId") String userId) {
        return billingService.calculateBill(userId);
    }
}
