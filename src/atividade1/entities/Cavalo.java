package atividade1.entities;

import atividade1.model.Animal;

public class Cavalo extends Animal {
    public Cavalo(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "O " + name + " relinchou!";
    }

    @Override
    public String move(String metros) {
        return "O " + name + " correu " + metros;
    }
}
