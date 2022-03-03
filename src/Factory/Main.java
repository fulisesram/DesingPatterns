package Factory;

import Factory.Service.Impl.Conexion;

public class Main {

    public static void main(String[] args) {
        FactoryConexion fabrica = new FactoryConexion();

        Conexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        Conexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        Conexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
}
