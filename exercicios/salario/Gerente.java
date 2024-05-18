package exercicios.salario;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, double valorHora, double horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.05;
    }
}
