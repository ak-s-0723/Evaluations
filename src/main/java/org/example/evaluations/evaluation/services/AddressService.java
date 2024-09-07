package org.example.evaluations.evaluation.services;

import org.antlr.v4.runtime.misc.Pair;
import org.example.evaluations.evaluation.repos.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    public Pair<String,String> getCityAndPincodeFromAddressId(Long addressId) {
        return null;
    }
}
