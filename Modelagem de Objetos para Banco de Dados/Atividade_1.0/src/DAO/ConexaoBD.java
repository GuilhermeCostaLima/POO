package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static ConexaoBD instancia;
    private ConexaoBD(){}

    public synchronized static ConexaoBD getInstancia(){
        if(instancia == null){
            instancia = new ConexaoBD();
        }
        return instancia;
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:livraria.db";
        return DriverManager.getConnection(url);
    }
}