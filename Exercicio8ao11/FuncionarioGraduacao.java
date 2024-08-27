public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    public String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio, comissao);
        this.universidade = universidade;
        setRenda(getRenda() * 2);
    }
    
    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio);
        this.universidade = universidade;
        setRenda(getRenda() * 2);
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

}
