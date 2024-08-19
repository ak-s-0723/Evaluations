package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.User;

public interface IUserService {
    User add(User user);

    User update(User user,Long userId);
}
