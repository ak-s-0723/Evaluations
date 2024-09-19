package org.example.evaluations.services;

import org.example.evaluations.evaluation.models.Sex;
import org.example.evaluations.evaluation.models.User;
import org.example.evaluations.evaluation.repos.UserRepository;
import org.example.evaluations.evaluation.services.UserSearchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageRequest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserSearchServiceTest {

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserSearchService userSearchService;


    @Test
    public void testGetUsersHavingAddress() {
        // Arrange
        User user1 = createUser(1L, "user1@example.com", "User One", "Street", Sex.MALE,3);
        User user2 = createUser(2L, "user2@example.com", "User Two", "Street", Sex.FEMALE,4);

        List<User> users = Arrays.asList(user1, user2);

        when(userRepository.findUserByAddressEquals("Street", PageRequest.of(0, 5))).thenReturn(users);

        // Act
        List<User> result = userSearchService.getUsersHavingAddress("Street", 0);

        // Assert
        assertEquals(2, result.size(),"You need to declare `findUserByAddressEquals` in UserRepo");
        assertEquals("user1@example.com", result.get(0).getEmailId(),"You need to declare `findUserByAddressEquals` in UserRepo");
    }

    @Test
    public void testGetDetailsOfAllLadies() {
        // Arrange
        User lady1 = createUser(1L, "lady1@example.com", "Lady One", "123 Street", Sex.FEMALE,12);
        List<User> ladies = Arrays.asList(lady1);

        when(userRepository.findUserBySexEquals(Sex.FEMALE, PageRequest.of(0, 5))).thenReturn(ladies);

        // Act
        List<User> result = userSearchService.getDetailsOfAllLadies(0);

        // Assert
        assertEquals(1, result.size(), "You need to declare `findUserBySexEquals` in UserRepo");
        assertEquals("lady1@example.com", result.get(0).getEmailId(),"You need to declare `findUserBySexEquals` in UserRepo");
    }

    @Test
    public void testGetDetailsOfAllAdultMales() {
        // Arrange
        User male1 = createUser(1L, "male1@example.com", "Male One", "1234567890", Sex.MALE,21);
        List<User> males = Arrays.asList(male1);

        when(userRepository.findUserBySexAndAgeGreaterThanEqual(Sex.MALE, 18, PageRequest.of(0, 5))).thenReturn(males);

        // Act
        List<User> result = userSearchService.getDetailsOfAllAdultMales(0);

        // Assert
        assertEquals(1, result.size(),"You need to declare `findUserBySexAndAgeGreaterThanEqual` in UserRepo");
        assertEquals("male1@example.com", result.get(0).getEmailId(),"You need to declare `findUserBySexAndAgeGreaterThanEqual` in UserRepo");
    }

    private User createUser(Long id, String emailId, String name, String phoneNumber, Sex sex,Integer age) {
        User user = new User();
        user.setId(id);
        user.setEmailId(emailId);
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setSex(sex);
        user.setAge(age);
        return user;
    }
}
