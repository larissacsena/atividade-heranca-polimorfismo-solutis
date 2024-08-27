package atividade1.entities;

import atividade1.model.Animal;

public class Cachorro extends Animal {

    public Cachorro(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "O " + name + " latiu!";
    }

    @Override
    public String move(String metros) {
        return "O " + name + " correu " + metros;
    }
}
