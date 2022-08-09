package com.thiagosantana.tscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagosantana.tscatalog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
