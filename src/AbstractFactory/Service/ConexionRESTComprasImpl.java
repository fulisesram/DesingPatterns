package AbstractFactory.Service;

import AbstractFactory.Interfaz.IConexionREST;

public class ConexionRESTComprasImpl implements IConexionREST {

    @Override
    public void leerURL(String url) {

        System.out.println("Conectándose a " + url);

    }

}
