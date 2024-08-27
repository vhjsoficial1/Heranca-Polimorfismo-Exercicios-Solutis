package Exercicio1ao4;

import java.util.Random;

public class Zoologico {
    Animal[] jaulas = new Animal[10];

    public Zoologico() {
        Random random = new Random();
        for (int i = 0; i < jaulas.length; i++) {
            int tipoAnimal = random.nextInt(3);
            switch (tipoAnimal) {
                case 0 -> jaulas[i] = new Cachorro("Cachorro " + i, random.nextInt(15));
                case 1 -> jaulas[i] = new Cavalo("Cavalo " + i, random.nextInt(20));
                case 2 -> jaulas[i] = new Preguica("Preguiça " + i, random.nextInt(10));
            }
        }
    }

    public void percorrerJaula() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            System.out.println("\nJaula " + (i + 1) + ":");
            animal.emitirSom();
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            }
        }
    }

        public static void main(String[] args) {
            Zoologico zoologico = new Zoologico();
            zoologico.percorrerJaula();
        }

}