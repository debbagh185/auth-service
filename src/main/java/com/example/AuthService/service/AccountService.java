package com.example.AuthService.service;

import com.example.AuthService.entities.Role;
import com.example.AuthService.entities.User;

import java.util.List;

public interface AccountService {
    User addUser(User user);
    Role addRole(Role role);
    void addRoleToUser(String userName,String roleName);
    User loadUserByUsername(String userName);
    List<User> listUsers();
}
