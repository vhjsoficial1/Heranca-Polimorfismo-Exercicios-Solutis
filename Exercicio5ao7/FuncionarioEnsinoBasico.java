public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, int idade, String escolaEnsinoBasico) {
        super(nome, idade);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
        setRenda(getRenda() * 1.1);
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

}
