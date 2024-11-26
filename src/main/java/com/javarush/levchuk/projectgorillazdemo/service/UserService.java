package com.javarush.levchuk.projectgorillazdemo.service;

import com.javarush.levchuk.projectgorillazdemo.entity.User;
import com.javarush.levchuk.projectgorillazdemo.repository.Repository;
import com.javarush.levchuk.projectgorillazdemo.repository.UserRepository;

import java.util.Collection;
import java.util.Optional;

public enum UserService {
    USER_SERVICE;
    private final Repository<User> userRepository = new UserRepository();

    public void create(User user) {
        userRepository.create(user);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public Collection<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> get(long id) {
        return userRepository.get(id);
    }
}
