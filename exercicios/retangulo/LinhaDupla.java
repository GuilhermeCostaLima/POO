package exercicios.retangulo;

public class LinhaDupla extends Retangulo{
    public LinhaDupla(String texto) {
        super(texto);
    }

    @Override
    public void desenhar() {
        System.out.println("╔═════════╗");
        System.out.println("║ " + texto + " ║");
        System.out.println("╚═════════╝");
    }
}
