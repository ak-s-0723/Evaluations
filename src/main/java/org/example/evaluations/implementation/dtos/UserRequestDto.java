package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.evaluations.implementation.models.Address;
import org.example.evaluations.implementation.models.Name;

@Setter
@Getter
public class UserRequestDto {
    private String email;
    private String password;
    private String username;
    private Name name;
    private Address address;
}
