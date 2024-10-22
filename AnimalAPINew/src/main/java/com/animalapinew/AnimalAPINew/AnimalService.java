package com.animalapinew.AnimalAPINew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    /**
     * list all animals
     * @return list of animals
     */

    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    /**
     * find an animal by id
     * @param AnimalId
     * @return an animal
     */
    public Animal getAnimalById(int AnimalId){
        return animalRepository.findById(AnimalId).orElse(null);
    }

    /**
     * Find all animals by class
     * @param animalCl
     * @return List of animals (same class)
     */
    public List<Animal> getAllAnimalByClassName(String animalCl){
        return animalRepository.getAnimalByAnimalCl(animalCl);
    }

    /**
     * Find animals whose name contains a string
     * @param name
     * @return
     */
    public List<Animal> getAnimalsContainingName(String name){
        return animalRepository.findByNameContaining(name);
    }

    /**
     * Add new animal
     * @param animal
     */

    public void addNewAnimal(Animal animal){
        animalRepository.save(animal);
    }

    /**
     * Delete an animal by Id
     * @param Id
     */
    public void deleteAnimalById(int Id){

        animalRepository.deleteById(Id);

    }

    /**
     * Update animal information
     * @param Id
     * @param animal
     */
    public void updateAnimal(int Id, Animal animal){
        Animal existing_animal = getAnimalById(Id);
        existing_animal.setName(animal.getName());
        existing_animal.setAnimalCl(animal.getAnimalCl());
        existing_animal.setHabitat(animal.getHabitat());
        existing_animal.setDescription(animal.getDescription());
        existing_animal.setScientificName(animal.getScientificName());
        //Save it
        animalRepository.save(existing_animal);


    }



}
