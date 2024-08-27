package atividade3.entities;

import atividade1.model.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando: " + animal.getName());
        System.out.println(animal.makeSound());
    }
}
