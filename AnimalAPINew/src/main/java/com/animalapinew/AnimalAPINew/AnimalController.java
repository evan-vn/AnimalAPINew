package com.animalapinew.AnimalAPINew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public List<Animal> getAllAnimal(){ return animalService.getAllAnimals();}


    @GetMapping("/{animalId}")
    public Animal getAnimalById(@PathVariable int animalId){
        return animalService.getAnimalById(animalId);
    }

    @GetMapping("/search/{animalCl}")
    public List<Animal> getAnimalByClassName(@PathVariable String animalCl){
        return animalService.getAllAnimalByClassName(animalCl);
    }

    @GetMapping("/search")
    public List<Animal> getAnimalByContainingName(@RequestParam (name="name") String name){
        return animalService.getAnimalsContainingName(name);
    }



    @PostMapping("/new")
    public List<Animal> addNewAnimal(@RequestBody Animal animal){
            animalService.addNewAnimal(animal);
            return animalService.getAllAnimals();

    }

    @PutMapping("update/{animalId}")
    public Animal updateAnimal(@PathVariable int animalId, @RequestBody Animal animal){

            animalService.updateAnimal(animalId, animal);
            return animalService.getAnimalById(animalId);
    }

    @DeleteMapping("delete/{animalId}")
    public List<Animal> deleteAnimalById(@PathVariable int animalId){
        animalService.deleteAnimalById(animalId);
        return animalService.getAllAnimals();
    }



}
