package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Sex_;
import org.example.evaluations.implementation.models.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository_ extends JpaRepository<User,Long> {

    List<User> findUserByAddressEquals(String address, Pageable pageable);

    List<User> findUserBySexEquals(Sex_ sex, Pageable pageable);

    List<User> findUserBySexAndAgeGreaterThanEqual(Sex_ sex, Integer integer, Pageable pageable);
}
