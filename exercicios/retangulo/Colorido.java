package exercicios.retangulo;

public class Colorido extends Retangulo {
    public Colorido(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_RED + "+---------+");
        System.out.println("| " + texto + " |");
        System.out.println("+---------+" + ANSI_RESET);
    }
}
