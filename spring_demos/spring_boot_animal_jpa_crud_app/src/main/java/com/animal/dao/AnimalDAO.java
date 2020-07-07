package com.animal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.model.Animal;

@Repository
public interface AnimalDAO extends JpaRepository<Animal, Integer>{

	public List<Animal> findByAge(int age);
	public List<Animal> findByCategory(String category);
}
