package atividade4.model;

import atividade1.entities.Cachorro;
import atividade1.entities.Cavalo;
import atividade1.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    List<Animal> cages;

    public Zoologico() {
        cages = new ArrayList<>(10);
    }

    public void addAnimal(Animal animal) {
        cages.add(animal);
    }

    public void walkThroughCages() {
        for (Animal animal : cages) {
            if (animal != null) {
                System.out.println(animal.makeSound());

                if (animal instanceof Cavalo || animal instanceof Cachorro) {
                    System.out.println(animal.move("100 metros"));
                    System.out.println();
                } else {
                    System.out.println(animal.move());
                    System.out.println();
                }
            }
        }
    }
}
