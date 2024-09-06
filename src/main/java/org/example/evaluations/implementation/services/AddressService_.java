package org.example.evaluations.implementation.services;

import org.antlr.v4.runtime.misc.Pair;
import org.example.evaluations.implementation.models.Address_;
import org.example.evaluations.implementation.repos.AddressRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService_ {

    @Autowired
    private AddressRepo_ addressRepo;

    public Pair<String,String> getCityAndPincodeFromAddressId(Long addressId) {
        Address_ address = addressRepo.findById(addressId).get();
        return new Pair<>(address.getCity(),address.getPincode());
    }
}
