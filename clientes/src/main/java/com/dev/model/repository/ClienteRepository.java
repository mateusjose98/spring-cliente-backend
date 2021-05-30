package com.dev.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
