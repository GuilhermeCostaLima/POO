package exercicios.retangulo;

public class AsciiArt extends Retangulo {
    public AsciiArt(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("+---------+");
        System.out.println("| " + texto + " |");
        System.out.println("+---------+");
    }
}

