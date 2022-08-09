package com.thiagosantana.tscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagosantana.tscatalog.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
