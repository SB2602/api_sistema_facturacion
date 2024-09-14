package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.User;
import com.api.sfacturacion.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
        if (user.getId() != null) {
            Optional<User> existingUser = userRepository.findById(user.getId());
            if (existingUser.isPresent()) {
                User dbUser = existingUser.get();
                user.setFecha_creacion(dbUser.getFecha_creacion()); // Mantén la fecha de creación original
            }
        } else {
            user.setFecha_creacion(LocalDateTime.now()); // Establece la fecha de creación solo si el usuario es nuevo
        }
        userRepository.save(user);
    }

    public void deleteById(Long Id) {
        userRepository.deleteById(Id);
    }
}
