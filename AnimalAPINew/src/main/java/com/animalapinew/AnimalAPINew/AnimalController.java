package com.animalapinew.AnimalAPINew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public String getAllAnimal(Model model){
        List<Animal> animalList= animalService.getAllAnimals();
        model.addAttribute("animalList", animalList);
        return "/animal-list";
    }
    @GetMapping("/details/{id}")
    public String detailAnimal(@PathVariable int id, Model model){
        //Get user by and display it first
        String name = animalService.getAnimalById(id).getName() + " Details";
        model.addAttribute("animal", animalService.getAnimalById(id));
        model.addAttribute("name", name);
        return "/animal-details";
    }
    @GetMapping("/createAnimalForm")
    public String createNewAnimalForm(Model model){
        return "/animal-create";
    }

    @PostMapping("/createAnimal")
     public String createNewAnimal(@ModelAttribute("animal") Animal animal){
        animalService.addNewAnimal(animal);
        return "redirect:/animals/all";
    }

    @PostMapping("/edit/{id}")
    public String updateUser(@PathVariable int id, @ModelAttribute Animal animal) {
        animalService.updateAnimal(id, animal);
        return "redirect:/animals/all";
    }
    @GetMapping("/edit/{id}")
    public String editAnimal(@PathVariable int id, Model model){
        //Get user by and display it first
        model.addAttribute("animal", animalService.getAnimalById(id));

        return "/animal-update";
    }

    @GetMapping("/delete/{id}")
    public String deleteAnimal(@PathVariable int id){
        animalService.deleteAnimalById(id);
        return "redirect:/animals/all";
    }

    @GetMapping("/search")
    public String getAnimalsByName(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("animalList", animalService.getAnimalsContainingName(name));

        return "/animal-list";
    }
    @GetMapping("/search/{animalCl}")
    public String getAnimalByClassName(@PathVariable String animalCl, Model model){
        model.addAttribute("animalList", animalService.getAllAnimalByClassName(animalCl));
        return "animal-list";

    }


//
//    @GetMapping("/{animalId}")
//    public Animal getAnimalById(@PathVariable int animalId){
//        return animalService.getAnimalById(animalId);
//    }
//
//    @GetMapping("/search/{animalCl}")
//    public List<Animal> getAnimalByClassName(@PathVariable String animalCl){
//        return animalService.getAllAnimalByClassName(animalCl);
//    }
//
//    @GetMapping("/search")
//    public List<Animal> getAnimalByContainingName(@RequestParam (name="name") String name){
//        return animalService.getAnimalsContainingName(name);
//    }
//
//
//
//    @PostMapping("/new")
//    public List<Animal> addNewAnimal(@RequestBody Animal animal){
//            animalService.addNewAnimal(animal);
//            return animalService.getAllAnimals();
//
//    }
//
//    @PutMapping("update/{animalId}")
//    public Animal updateAnimal(@PathVariable int animalId, @RequestBody Animal animal){
//
//            animalService.updateAnimal(animalId, animal);
//            return animalService.getAnimalById(animalId);
//    }
//
//    @DeleteMapping("delete/{animalId}")
//    public List<Animal> deleteAnimalById(@PathVariable int animalId){
//        animalService.deleteAnimalById(animalId);
//        return animalService.getAllAnimals();
//    }



}
