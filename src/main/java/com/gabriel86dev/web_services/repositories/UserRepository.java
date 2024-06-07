package com.gabriel86dev.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel86dev.web_services.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
