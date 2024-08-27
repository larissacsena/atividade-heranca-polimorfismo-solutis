package atividade1.entities;

import atividade1.model.Animal;

public class Preguica extends Animal {

    public Preguica(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "A " + name + " gritou!";
    }

    @Override
    public String move() {
        return "A " + name + " Subiu em uma árvore";
    }
}
