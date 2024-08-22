package DAO;

import java.sql.Connection;
import java.sql.SQLException;

class BaseDAO {
    protected Connection con() throws SQLException {
        return ConexaoBD.getInstancia().getConnection();
    }
}