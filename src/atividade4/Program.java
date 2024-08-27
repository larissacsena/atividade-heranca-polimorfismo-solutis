package atividade4;

import atividade1.entities.Cachorro;
import atividade1.entities.Cavalo;
import atividade1.entities.Preguica;
import atividade4.model.Zoologico;

public class Program {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();

        zoologico.addAnimal(new Cachorro("Rex", 5));
        zoologico.addAnimal(new Cavalo("Trovão", 7));
        zoologico.addAnimal(new Preguica("Sid", 12));
        zoologico.addAnimal(new Cachorro("Max", 3));
        zoologico.addAnimal(new Cavalo("Relâmpago", 4));
        zoologico.addAnimal(new Preguica("Mel", 6));
        zoologico.addAnimal(new Cachorro("Buddy", 2));
        zoologico.addAnimal(new Cavalo("Fúria", 8));
        zoologico.addAnimal(new Preguica("Luna", 5));
        zoologico.addAnimal(new Cachorro("Rocky", 4));

        zoologico.walkThroughCages();
    }
}
