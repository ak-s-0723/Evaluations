package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.FakeStoreLoginRequestDto;
import org.springframework.util.MultiValueMap;

public interface IAuthService {
    MultiValueMap<String, String> login(FakeStoreLoginRequestDto fakeStoreLoginRequestDto);
}
