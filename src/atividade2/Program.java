package atividade2;

import atividade1.model.Animal;
import atividade1.entities.Cachorro;
import atividade1.entities.Cavalo;
import atividade1.entities.Preguica;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Cachorro", 5));
        animais.add(new Cavalo("Cavalo", 7));
        animais.add(new Preguica("Preguiça", 12));

        for (Animal animal : animais) {
            System.out.println(animal);
        }

        System.out.println(animais.get(0).makeSound() + "\n" + animais.get(0).move("7 metros"));
        System.out.println();
        System.out.println(animais.get(1).makeSound() + "\n" + animais.get(1).move("20 metros"));
        System.out.println();
        System.out.println(animais.get(2).makeSound() + "\n" + animais.get(2).move());
    }
}