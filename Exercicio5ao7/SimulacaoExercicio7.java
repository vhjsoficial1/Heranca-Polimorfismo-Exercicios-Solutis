public class SimulacaoExercicio7 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 10; i++){
            if (i < 4){
                funcionarios[i] = new FuncionarioEnsinoBasico("Funcionário com Ensino Basico " + i, "" + i, "Escola Ensino Básico " + i);
            } else if (i < 8){
                funcionarios[i] = new FuncionarioEnsinoMedio("Funcionário com Ensino Médio " + i, "" + i, "Escola Ensino Básico " + i, "Escola Eensino Médio " + i);
            } else {
                funcionarios[i] = new FuncionarioGraduacao("Funcionário com Graduação " + i, "" + i, "Escola Ensino Básico " + i, "Escola Eensino Médio " + i, "Universidade " + i);
            }
        }
        double custosSalariosTotais = 0;
        double custosSalariosEnsinoBasico = 0;
        double custosSalariosEnsinoMedio = 0;
        double custosSalariosGraduacao = 0;
        for (Funcionario funcionario : funcionarios){
            custosSalariosTotais += funcionario.getRenda();
            if (funcionario instanceof FuncionarioGraduacao){
                custosSalariosGraduacao += funcionario.getRenda();
            } else if (f instanceof FuncionarioEnsinoMedio){
                custosSalariosEnsinoMedio += funcionario.getRenda();
            } else {
                custosSalariosEnsinoBasico += funcionario.getRenda();
            }
        }
        System.out.println("Custos totais: R$" + custosSalariosTotais);
        System.out.println("Custos salários Educação Básica: R$" + custosSalariosEnsinoBasico);
        System.out.println("Custos salários Ensino Médio: R$" + custosSalariosEnsinoMedio);
        System.out.println("Custos salários Graduação: R$" + custosSalariosGraduacao);
    }
}