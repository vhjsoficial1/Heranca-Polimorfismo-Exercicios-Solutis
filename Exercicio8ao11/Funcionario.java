public abstract class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double renda;
    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.comissao = comissao;
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.renda = 1000;
    }

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.renda = 1000;
    }

    public double rendaTotal(){
        return (renda + comissao.getComissao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return nome + " {\n\tComissao: " + comissao + ",\n\tRenda total: R$" + rendaTotal() + "\n}";
    }

}