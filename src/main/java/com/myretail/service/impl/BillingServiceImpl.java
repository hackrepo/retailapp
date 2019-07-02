package com.myretail.service.impl;

import com.myretail.model.User;
import com.myretail.service.BillingService;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceImpl implements BillingService {

    @Override
    public Double calculateBill(String userId) {

        //fetch the user detail with purchase detail from DB with the help of userId, as of now just initiated the user using lombok
        User user = User.builder().build();
        Integer totalPrice = user.getProducts().stream().mapToInt(p -> p.getPrice()).sum();
        switch (user.getUserType()) {
            case EMPLOYEE:
                return totalPrice - (totalPrice * 0.3);
            case AFFILIATE:
                return totalPrice - (totalPrice * 0.1);
            case CUSTOMER_2_YEARS:
                return totalPrice - (totalPrice * 0.05);
            default:
                int factor = totalPrice / 100;
                return Double.valueOf(totalPrice - (5*factor));
        }
    }
}
