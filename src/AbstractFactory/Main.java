package AbstractFactory;

import AbstractFactory.Interfaz.*;

public class Main  {

    public static void main(String[] args) {

        /** Instanciamos AbstractFactory que hace fabricas */
        IAbstractFactory fabricaBD = FabricaProductor.getFactory("BD");
        /** Indicamos que clase/producto/cosa necesitamos de la fabrica */
        IConexionDB obj = fabricaBD.getBD("MYSQL");
        /** Ya podemos trabajar con el objeto*/
        obj.conectar();


        IAbstractFactory fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");
        cxRS1.leerURL("https://www.youtube.com/watch?v=4pcNRDx6KrE");
    }

}