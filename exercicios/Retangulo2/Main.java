package exercicios.Retangulo2;

public class Main {
    public static void main(String[] args) {
        Retangulo2 retangulo = new Retangulo2(5, 3);
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado(4);
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
    }
}
