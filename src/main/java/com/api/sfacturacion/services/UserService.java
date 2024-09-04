package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.User;
import com.api.sfacturacion.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el proveedor con el id+" + id));
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteById(Long Id) {
        userRepository.deleteById(Id);
    }
}
