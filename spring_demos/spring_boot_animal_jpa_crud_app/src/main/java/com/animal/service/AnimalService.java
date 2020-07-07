package com.animal.service;

import java.util.List;

import com.animal.exception.BusinessException;
import com.animal.model.Animal;

public interface AnimalService {

	public Animal createAnimal(Animal animal);
	public Animal updateAnimal(Animal animal);
	public Animal getAnimalById(int id) throws BusinessException;
	public List<Animal> getAllAnimals();
	public List<Animal> getAnimalsByAge(int age);
	public List<Animal> getAnimalsByCategory(String category);
	public void deleteAnimalById(int id);
}
