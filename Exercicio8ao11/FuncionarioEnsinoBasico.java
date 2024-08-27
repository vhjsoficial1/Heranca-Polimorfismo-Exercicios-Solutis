public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaEnsinoBasico, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
        setRenda(getRenda() * 1.1);
    }

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional);
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
