package com.kingCode.Project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kingCode.Project1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
