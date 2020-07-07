package com.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.animal.exception.BusinessException;
import com.animal.model.Animal;
import com.animal.service.AnimalService;

@RestController
public class AnimalController {

	@Autowired
	private AnimalService service;
	
	private MultiValueMap<String, String> map;
	@PostMapping("/animal")
	public Animal createAnimal(@RequestBody Animal animal) {

		return service.createAnimal(animal);
	}

	@PutMapping("/animal")
	public Animal updateAnimal(@RequestBody Animal animal) {

		return service.updateAnimal(animal);
	}

	
	@GetMapping("/animal/{id}")
	public ResponseEntity<Animal> getAnimalById(@PathVariable("id") int id) {

		try {
			return new ResponseEntity<Animal>(service.getAnimalById(id),HttpStatus.OK);
		} catch (BusinessException e) {
			map=new LinkedMultiValueMap<>();
			map.add("message", e.getMessage());
			return new ResponseEntity<Animal>(null,map, HttpStatus.NOT_FOUND);
		}
		
	}

	@GetMapping("/animals")
	public List<Animal> getAllAnimals() {

		return service.getAllAnimals();
	}

	@GetMapping("/animals/age/{age}")
	public List<Animal> getAnimalsByAge(@PathVariable("age") int age) {

		return service.getAnimalsByAge(age);
	}

	@GetMapping("/animals/category/{category}")
	public List<Animal> getAnimalsByCategory(@PathVariable("category") String category) {

		return service.getAnimalsByCategory(category);
	}

	@DeleteMapping("/animal/{id}")
	public void deleteAnimalById(@PathVariable("id") int id) {
		service.deleteAnimalById(id);

	}
}
