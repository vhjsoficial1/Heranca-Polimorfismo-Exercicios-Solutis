package Exercicio8ao11;

public class SimulacaoExercio11 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        for (int i = 0; i < 10; i++){
            if (i < 4){
                funcionarios[i] = new FuncionarioEnsinoBasico("Funcionário com Ensino Básico " + i, "" + i, "Escola Ensino Básico " + i);
            } else if (i < 8){
                funcionarios[i] = new FuncionarioEnsinoMedio("Funcionário com Ensino Médio " + i, "" + i, "Escola Ensino Básico " + i, "Escola Ensino Médio " + i);
            } else {
                funcionarios[i] = new FuncionarioGraduacao("Funcionário com Graduação " + i, "" + i, "Escola Ensino Básico " + i, "Escola Ensino Médio " + i, "Universidade " + i);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i < 7){
                funcionarios[i].setComissao(Comissao.Vendedor);
            } else if (i < 9){
                funcionarios[i].setComissao(Comissao.Supervisor);
            } else {
                funcionarios[i].setComissao(Comissao.Gerente);
            }
        }
        
        double custosSalariosTotais = 0;
        double custosSalariosEnsinoBasico = 0;
        double custosSalariosEnsinoMedio = 0;
        double custosSalariosGraduacao = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            custosSalariosTotais += funcionarios[i].getRenda();
            if (funcionarios[i] instanceof FuncionarioGraduacao) {
                custosSalariosGraduacao += funcionarios[i].getRenda();
            } else if (funcionarios[i] instanceof FuncionarioEnsinoMedio) {
                custosSalariosEnsinoMedio += funcionarios[i].getRenda();
            } else {
                custosSalariosEnsinoBasico += funcionarios[i].getRenda();
            }
        }

        System.out.println(String.format("Custos totais: R$ %.2f", custosSalariosTotais));
        System.out.println(String.format("Custos salários Educação Básica: R$ %.2f", custosSalariosEnsinoBasico));
        System.out.println(String.format("Custos salários Ensino Médio: R$ %.2f", custosSalariosEnsinoMedio));
        System.out.println(String.format("Custos salários Graduação: R$ %.2f", custosSalariosGraduacao));

        for (Funcionario funcionario : funcionarios){
            System.out.println("\n" + funcionario + "\n");
        }
}

}