package AbstractFactory;

import AbstractFactory.Interfaz.IAbstractFactory;
import AbstractFactory.Interfaz.IConexionDB;
import AbstractFactory.Interfaz.IConexionREST;
import AbstractFactory.Service.ConexionMySQLImpl;
import AbstractFactory.Service.ConexionOracleImpl;
import AbstractFactory.Service.ConexionSQLServerImpl;
import AbstractFactory.Service.EmptyConnectionImpl;

public class ConexionBDFabrica implements IAbstractFactory {


    @Override
    public IConexionDB getBD(String motorBD) {
        if (motorBD == null) {
            return new EmptyConnectionImpl();
        }
        if (motorBD.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQLImpl();
        } else if (motorBD.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracleImpl();
        } else if (motorBD.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServerImpl();
        }

        return new EmptyConnectionImpl();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}
