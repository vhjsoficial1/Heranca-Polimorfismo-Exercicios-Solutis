package Exercicio8ao11;

public enum Comissao {
    Gerente(1500),
    Supervisor(600),
    Vendedor(250);

    private final double comissao;
    
    Comissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
