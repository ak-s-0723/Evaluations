package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Access;
import org.example.evaluations.implementation.models.Permission;
import org.example.evaluations.implementation.models.Resource;
import org.example.evaluations.implementation.models.Role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Override
    public List<Permission> getPermissionsBasedOnRoles(List<String> roles) {
        List<Permission> permissions = new ArrayList<>();
        if(roles.contains(Role.INSTRUCTOR.toString())) {
            Permission permission = new Permission();
            permission.setAccess(Access.HOST);
            permission.setResource(Resource.LECTURE);
            permissions.add(permission);
        }

        if(roles.contains(Role.TA.toString())) {
            Permission permission = new Permission();
            permission.setAccess(Access.HOST);
            permission.setResource(Resource.HELP_REQUEST);
            permissions.add(permission);
        }

        return permissions;
    }

    @Override
    public Boolean isOnboarded(Long id, String email) {
        return id != null && email != null;
    }

    @Override
    public Boolean isIdentityProvided(String email, String password, String name) {
      return (password != null && (email != null || name != null));
    }
}