package com.animalapinew.AnimalAPINew;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    List<Animal> getAnimalByAnimalCl(String animalCl);

    @Query(value ="Select * From animals a Where a.name Like %:name%", nativeQuery=true)
    List<Animal> findByNameContaining(@Param("name")  String name);





}