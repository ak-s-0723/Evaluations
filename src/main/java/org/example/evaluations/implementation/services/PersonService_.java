package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Address_;
import org.example.evaluations.implementation.models.Person_;
import org.example.evaluations.implementation.repos.PersonRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PersonService_ {

    @Autowired
    private PersonRepo_ personRepo;

    public Set<String> getAllUniqueCities() {
        Set<String> cities = new HashSet<>();

        List<Person_> personList = personRepo.findAll();
        for(Person_ person : personList) {
            List<Address_> addresses = person.getAddresses();
            for(Address_ address : addresses) {
                cities.add(address.getCity());
            }
        }
        return cities;
    }

    public Set<String> getCitiesWherePersonLivedAt(Long personId) {
        Set<String> cities = new HashSet<>();

        Person_ person = personRepo.findById(personId).get();
        List<Address_> addresses = person.getAddresses();
        for(Address_ address : addresses) {
            cities.add(address.getCity());
        }

        return cities;
    }
}
