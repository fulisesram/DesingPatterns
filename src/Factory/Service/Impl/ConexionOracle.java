package Factory.Service.Impl;

public class ConexionOracle implements Conexion {

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
        System.out.println("Se conectó a ConexionOracle");

    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de ConexionOracle");
    }

}
