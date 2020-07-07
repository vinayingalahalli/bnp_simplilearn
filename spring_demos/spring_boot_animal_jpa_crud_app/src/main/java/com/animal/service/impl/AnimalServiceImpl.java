package com.animal.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animal.dao.AnimalDAO;
import com.animal.exception.BusinessException;
import com.animal.model.Animal;
import com.animal.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
	@Autowired
	private AnimalDAO dao;

	@Override
	public Animal createAnimal(Animal animal) {
		
		return dao.save(animal);
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		
		return dao.save(animal);
	}

	@Override
	public Animal getAnimalById(int id) throws BusinessException {
		if(id<=0) {
			throw new BusinessException("Id "+id +" is invalid");
		}
		Animal animal=null;
		try {
		animal=dao.findById(id).get();
		}catch(NoSuchElementException e) {
			throw new BusinessException("No animal found for id "+id);
		}
		return animal;
	}

	@Override
	public List<Animal> getAllAnimals() {
		
		return dao.findAll();
	}

	@Override
	public List<Animal> getAnimalsByAge(int age) {
		
		return dao.findByAge(age);
	}

	@Override
	public List<Animal> getAnimalsByCategory(String category) {
		
		return dao.findByCategory(category);
	}

	@Override
	public void deleteAnimalById(int id) {
		dao.deleteById(id);

	}

}
