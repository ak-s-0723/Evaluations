package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreUserRequestDto {
    private Long id;
    private String email;
    private String password;
    private String username;
    private FakeStoreUserNameDto name;
    private FakeStoreUserAddressDto address;
}
