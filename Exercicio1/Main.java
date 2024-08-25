package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Max", 12);
        Cavalo cavalo = new Cavalo("Caramelo", 2);
        Preguica preguica = new Preguica("Sid", 10);

        cachorro.emitirSom();
        cachorro.correr();

        cavalo.emitirSom();
        cavalo.correr();

        preguica.emitirSom();
        preguica.subirEmArvores();
    }
}
