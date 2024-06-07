package com.gabriel86dev.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel86dev.web_services.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
