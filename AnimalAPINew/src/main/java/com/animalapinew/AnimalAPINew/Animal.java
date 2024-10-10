package com.animalapinew.AnimalAPINew;

import jakarta.persistence.*;

@Entity
@Table(name="animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int animalID;

    @Column(nullable = false)
    private String name;

    private String scientificName;
    @Column(nullable = false)

    private String animalCl;

    @Column(nullable = false)
    private String habitat;

    private String description;


    public Animal(int animalID, String name, String scientificName, String animalCl, String habitat, String description) {
        this.animalID = animalID;
        this.name = name;
        this.scientificName = scientificName;
        this.animalCl = animalCl;
        this.habitat = habitat;
        this.description = description;
    }

    public Animal() {
    }

    public Animal(String name, String scientificName, String animalCl, String habitat, String description) {
        this.name = name;
        this.scientificName = scientificName;
        this.animalCl = animalCl;
        this.habitat = habitat;
        this.description = description;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getAnimalCl() {
        return animalCl;
    }

    public void setAnimalCl(String animalCl) {
        this.animalCl = animalCl;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}