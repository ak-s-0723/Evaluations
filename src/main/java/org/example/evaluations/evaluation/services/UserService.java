package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.dtos.FakeStoreUserAddressDto;
import org.example.evaluations.evaluation.dtos.FakeStoreUserDto;
import org.example.evaluations.evaluation.dtos.FakeStoreUserNameDto;
import org.example.evaluations.evaluation.models.Address;
import org.example.evaluations.evaluation.models.Name;
import org.example.evaluations.evaluation.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Override
    public User add(User user) {
        //Add your implementation here
        return null;
    }

    @Override
    public User update(User user, Long userId) {
        //Add your implementation here.
        return  null;
    }

    private FakeStoreUserDto from(User user) {
        FakeStoreUserDto fakeStoreUserDto = new FakeStoreUserDto();
        fakeStoreUserDto.setUsername(user.getUsername());
        fakeStoreUserDto.setPassword(user.getPassword());
        fakeStoreUserDto.setEmail(user.getEmail());
        if(user.getAddress() != null) {
            FakeStoreUserNameDto name = new FakeStoreUserNameDto();
            name.setFirstname(user.getName().getFirstname());
            name.setLastname(user.getName().getLastname());
            fakeStoreUserDto.setName(name);
        }
        if(user.getName() != null) {
            FakeStoreUserAddressDto address = new FakeStoreUserAddressDto();
            address.setCity(user.getAddress().getCity());
            address.setStreet(user.getAddress().getStreet());
            address.setNumber(user.getAddress().getNumber());
            fakeStoreUserDto.setAddress(address);
        }
        return fakeStoreUserDto;
    }



    private User from(FakeStoreUserDto fakeStoreUserDto) {
        User user = new User();

        user.setUsername(fakeStoreUserDto.getUsername());
        user.setPassword(fakeStoreUserDto.getPassword());
        user.setEmail(fakeStoreUserDto.getEmail());
        if(fakeStoreUserDto.getAddress() != null) {
            Name name = new Name();
            name.setFirstname(fakeStoreUserDto.getName().getFirstname());
            name.setLastname(fakeStoreUserDto.getName().getLastname());
            user.setName(name);
        }

        if(fakeStoreUserDto.getName() != null) {
            Address address = new Address();
            address.setCity(fakeStoreUserDto.getAddress().getCity());
            address.setStreet(fakeStoreUserDto.getAddress().getStreet());
            address.setNumber(fakeStoreUserDto.getAddress().getNumber());
            user.setAddress(address);
        }

        return user;
    }
}
