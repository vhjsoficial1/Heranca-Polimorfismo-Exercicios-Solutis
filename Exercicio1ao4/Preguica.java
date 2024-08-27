package Exercicio1ao4;

public class Preguica extends Animal {
    
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Preguiça");
    }

    public void subirEmArvores() {
        System.out.println("Preguiça subindo em árvores");
    }
}
