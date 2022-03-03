package Factory.Service.Impl;

public class ConexionMySQL implements Conexion {

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
        System.out.println("Se conectó a ConexionMySQL");

    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de ConexionMySQL");
    }

}