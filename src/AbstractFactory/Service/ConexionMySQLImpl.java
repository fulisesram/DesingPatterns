package AbstractFactory.Service;

import AbstractFactory.Interfaz.IConexionDB;

public class ConexionMySQLImpl implements IConexionDB {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public void ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a ConexionMySQLImp");

    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de ConexionMySQLImp");
    }

}