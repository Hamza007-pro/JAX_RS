package com.example.jaxrs.repository;

import com.example.jaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComptRepository extends JpaRepository<Compte,Long> {
}
