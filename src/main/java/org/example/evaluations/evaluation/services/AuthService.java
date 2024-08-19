package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.dtos.FakeStoreLoginRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

@Service
public class AuthService implements IAuthService {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    public MultiValueMap<String, String> login(FakeStoreLoginRequestDto fakeStoreLoginRequestDto) {
        //Add your implementation here.
        return null;
    }
}
