public class FuncionarioGraduacao extends Funcionario {
    public String universidade;

    public FuncionarioGraduacao(String nome, int idade, String universidade) {
        super(nome, idade);
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
