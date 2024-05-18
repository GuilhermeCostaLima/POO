package exercicios.salario;

public class Funcionario {
    protected String nome;
    protected double valorHora;
    protected double horasTrabalhadas;
    
    public Funcionario(String nome, double valorHora, double horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
