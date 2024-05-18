package exercicios.retangulo;

public class BordaArredondada extends Retangulo {
    public BordaArredondada(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("╭─────────╮");
        System.out.println("│ " + texto + " │");
        System.out.println("╰─────────╯");
    }
}
