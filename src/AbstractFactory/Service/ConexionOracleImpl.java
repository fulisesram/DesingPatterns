package AbstractFactory.Service;

import AbstractFactory.Interfaz.IConexionDB;

public class ConexionOracleImpl implements IConexionDB {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public void ConexionOracle() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a ConexionOracleImpl");

    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de ConexionOracleImpl");
    }

}
