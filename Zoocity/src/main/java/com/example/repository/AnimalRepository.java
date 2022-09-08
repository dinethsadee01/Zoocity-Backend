package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {
	
	public List<Animal> findAllByCategory(String category);
	
	public Animal findByAname(String aname);

	public List<Animal> findBySubspecie(String subspecie);

}
