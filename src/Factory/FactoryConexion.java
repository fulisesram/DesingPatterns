package Factory;

import Factory.Service.Impl.Conexion;
import Factory.Service.Impl.ConexionOracle;
import Factory.Service.Impl.ConexionVacia;
import Factory.Service.Impl.ConexionMySQL;

public class FactoryConexion {

    public Conexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }

        return new ConexionVacia();
    }

}


