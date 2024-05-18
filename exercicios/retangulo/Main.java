package exercicios.retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo BordaArredondada = new BordaArredondada("Oi");
        Retangulo LinhaDupla = new LinhaDupla("Oi");
        Retangulo AsciiArt = new AsciiArt("Oi");
        Retangulo Colorido = new Colorido("Oi");

        System.out.println("Retângulo com Bordas Arredondadas:");
        BordaArredondada.desenhar();

        System.out.println("\nRetângulo com Linhas Duplas:");
        LinhaDupla.desenhar();

        System.out.println("\nRetângulo com ASCII Art:");
        AsciiArt.desenhar();

        System.out.println("\nRetângulo Colorido:");
        Colorido.desenhar();
    }
}
