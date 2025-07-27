package com.mess.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mess.entity.User;
import com.mess.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public Optional<User> login(String email, String password) {
        return repo.findByEmail(email).filter(u -> u.getPassword().equals(password));
    }
}
