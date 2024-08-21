package org.example.evaluations.evaluation.clients;

import org.example.evaluations.evaluation.dtos.FakeStoreCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

@Component
public class FakeStoreClient {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreCart getCartById(Long cartId) {
        //Add your implementation here
       return null;
    }

    public FakeStoreCart[] getCartsByUserId(Long userId) {
        //Add your implementation here
        return null;
    }

    public FakeStoreCart deleteCartById(Long cartId) {
        //Add your implementation here
        return null;
    }

    public FakeStoreCart updateCart(Long cartId,FakeStoreCart request) {
        //Add your implementation here
        return null;
    }

    public FakeStoreCart addCart(FakeStoreCart request) {
        //Add your implementation here
        return null;
    }
}
