public class FuncionarioEnsinoMedio extends Funcionario {
    public String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, Comissao comissao) {
        super(nome, codigoFuncional, escolaEnsinoBasico, comissao);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        setRenda(getRenda() * 1.5);
    }
    
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico);
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
