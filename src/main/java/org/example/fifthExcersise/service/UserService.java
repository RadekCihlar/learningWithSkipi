package org.example.fifthExcersise.service;

import org.example.fifthExcersise.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    User getUserByUsername(String username);
}
