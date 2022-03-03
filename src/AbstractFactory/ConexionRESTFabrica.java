package AbstractFactory;

import AbstractFactory.Interfaz.IAbstractFactory;
import AbstractFactory.Interfaz.IConexionDB;
import AbstractFactory.Interfaz.IConexionREST;
import AbstractFactory.Service.*;
import AbstractFactory.Service.ConexionRESTVentasImpl;
import AbstractFactory.Service.ConexionRESTComprasImpl;

public class ConexionRESTFabrica implements IAbstractFactory {

    @Override
    public IConexionREST getREST(String areaREST) {
        if (areaREST == null) {
            return new ConexionRESTNoAreaImpl();
        }
        if (areaREST.equalsIgnoreCase("COMPRAS")) {
            return new ConexionRESTComprasImpl();
        } else if (areaREST.equalsIgnoreCase("VENTAS")) {
            return new ConexionRESTVentasImpl();
        }
        return new ConexionRESTNoAreaImpl();
    }

    @Override
    public IConexionDB getBD(String motor) {
        return null;
    }

}