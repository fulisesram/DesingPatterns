package AbstractFactory;

import AbstractFactory.Interfaz.*;

public class FabricaProductor {

    public static IAbstractFactory getFactory(String tipoFabrica) {

        if (tipoFabrica.equalsIgnoreCase("BD")) {
            return new ConexionBDFabrica();

        } else if (tipoFabrica.equalsIgnoreCase("REST")) {
            return new ConexionRESTFabrica();
        }

        return null;
    }
}

