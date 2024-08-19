package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.FakeStoreLoginRequestDto;
import org.example.evaluations.implementation.dtos.FakeStoreLoginResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@Service
public class AuthServiceImpl implements IAuthService {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    public MultiValueMap<String, String> login(FakeStoreLoginRequestDto fakeStoreLoginRequestDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        FakeStoreLoginResponseDto fakeStoreLoginResponseDto = restTemplate.postForEntity("https://fakestoreapi.com/auth/login",fakeStoreLoginRequestDto,FakeStoreLoginResponseDto.class).getBody();
        MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();
        headers.add(HttpHeaders.SET_COOKIE, fakeStoreLoginResponseDto.getToken());
        return headers;
    }
}
