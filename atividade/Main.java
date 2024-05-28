package atividade;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger(true);
        logger.log(Level.DEBUG, "Matheus joined the game");
        logger.log(Level.WARNING, "Você precisa baixar a versão mais recente!");
        logger.log(Level.ERROR, "Não foi possível abrir o arquivo!");

        logger.switchMode(false); 

        logger.log(Level.DEBUG, "Matheus joined the game");
        logger.log(Level.WARNING, "Você precisa baixar a versão mais recente!");
        logger.log(Level.ERROR, "Não foi possível abrir o arquivo!");
    }
}

