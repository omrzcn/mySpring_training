package com.cydeo.repository;

import com.cydeo.entity.Cart;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Id> {
}
