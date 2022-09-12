package com.example.controller;

import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Animal;
import com.example.repository.AnimalRepository;

@RestController
@RequestMapping("/animal")
@CrossOrigin
public class AnimalController {

@Autowired
AnimalRepository animalRepo;

@GetMapping("/list")
public List<Animal> displayAnimalList(){
	List<Animal> animalList = (List<Animal>) animalRepo.findAll();
	return animalList;
}

@PostMapping("/add")
public String addAnimal(@RequestBody Animal animal) {
	//System.out.println(animal);
	return animalRepo.save(animal).getAid() + "Added Successfully";
}
@GetMapping("/view_animal")
public Animal viewAnimal(@RequestParam ("id") int id ) {
	return animalRepo.findById(id).get();
}
@PutMapping("/update")
public String updateAnimal(@RequestBody Animal animal) {
	return animalRepo.save(animal).getAid() + "Update Successfully";
}
@DeleteMapping("/delete")
public String deleteAnimal(@RequestParam("id") int id) {
	animalRepo.deleteById(id);
	return "Delete Successfully";
}
/*
@GetMapping("/findByCategory")
public List<Animal> findByCategory(@RequestParam ("category") String category){
	List<Animal> animalList = (List<Animal>) animalRepo.findAllByCategory(category);
	return animalList;
	}

@GetMapping("/findByName")
public Animal findByName(@RequestParam ("name") String name) {
	return animalRepo.findByAname(name);
}
@GetMapping("/findBySubspecie")
public List<Animal> findBySubspecie(@RequestParam ("sucspecie") String subspecie){
	List<Animal> animalList = (List<Animal>) animalRepo.findBySubspecie(subspecie);
	return animalList;
	}*/
}

