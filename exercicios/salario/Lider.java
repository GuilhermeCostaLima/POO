package exercicios.salario;

public class Lider extends Funcionario {
    
    public Lider(String nome, double valorHora, double horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.02;
    }
}
