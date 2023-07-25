package org.example.fifthExcersise.service.impl;

import org.example.fifthExcersise.model.User;
import org.example.fifthExcersise.repository.UserRepository;
import org.example.fifthExcersise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = userRepository.findAll();

        if (allUsers.isEmpty()){
            return null;
        }

        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);

        return user.orElse(null);
    }

    @Override
    public User getUserByUsername(String username) {
        Optional<User> user = userRepository.findByUserName(username);
        return user.orElse(null);
    }
}
