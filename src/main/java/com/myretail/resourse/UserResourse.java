package com.myretail.resourse;

import com.myretail.model.Product;
import com.myretail.model.User;
import com.myretail.model.UserType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserResourse {

    //register user and return userid

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    User register() {
        return User.builder().build();
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    User getUser(@PathVariable("userId") String userId) {
        List<Product> list = new ArrayList<>();
        return User.builder()
                .userType(UserType.AFFILIATE)
                .products(list)
                .build();
    }
}
