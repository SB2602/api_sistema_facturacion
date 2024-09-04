package com.api.sfacturacion.repositories;

import com.api.sfacturacion.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
