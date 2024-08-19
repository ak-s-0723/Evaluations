package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.UserRequestDto;
import org.example.evaluations.implementation.models.Address;
import org.example.evaluations.implementation.models.Name;
import org.example.evaluations.implementation.models.User;
import org.example.evaluations.implementation.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public User addUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.add(from(userRequestDto));
    }

    @PutMapping("/{userId}")
    public User updateUser(@RequestBody UserRequestDto userRequestDto,@PathVariable Long userId) {
      return userService.update(from(userRequestDto),userId);
    }

    private User from(UserRequestDto userRequestDto) {
        User user = new User();

        user.setUsername(userRequestDto.getUsername());
        user.setPassword(userRequestDto.getPassword());
        user.setEmail(userRequestDto.getEmail());
        if(userRequestDto.getAddress() != null) {
            Name name = new Name();
            name.setFirstname(userRequestDto.getName().getFirstname());
            name.setLastname(userRequestDto.getName().getLastname());
            user.setName(name);
        }

        if(userRequestDto.getName() != null) {
            Address address = new Address();
            address.setCity(userRequestDto.getAddress().getCity());
            address.setStreet(userRequestDto.getAddress().getStreet());
            address.setNumber(userRequestDto.getAddress().getNumber());
            user.setAddress(address);
        }

        return user;
    }
}

/*
{
    "email":"John@gmail.com",
                    "username":"johnd",
                    "password":"m38rmF$",
                    "name":{
                        "firstname":"John",
                        "lastname":"Doe"
                    },
                    "address":{
                        "city":"kilcoole",
                        "street":"7835 new road",
                        "number":3
                      }
}
 */
