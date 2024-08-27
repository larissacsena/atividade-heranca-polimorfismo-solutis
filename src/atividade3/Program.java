package atividade3;

import atividade1.entities.Cachorro;
import atividade1.entities.Cavalo;
import atividade1.entities.Preguica;
import atividade1.model.Animal;
import atividade3.entities.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Cachorro", 5));
        animais.add(new Cavalo("Cavalo", 7));
        animais.add(new Preguica("Preguiça", 12));

        Veterinario veterinarian = new Veterinario();

        for (Animal animal : animais) {
            veterinarian.examinar(animal);
            System.out.println();
        }
    }
}
