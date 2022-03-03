package AbstractFactory.Service;

import AbstractFactory.Interfaz.IConexionREST;

public class ConexionRESTNoAreaImpl implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("AREA NO ELEGIDA");
    }
}
