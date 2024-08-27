public class FuncionarioEnsinoMedio extends Funcionario {
    public String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, int idade, String escolaEnsinoMedio) {
        super(nome, idade);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        setRenda(getRenda() * 1.5);
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

}
