package AbstractFactory.Service;

import AbstractFactory.Interfaz.IConexionDB;

public class EmptyConnectionImpl implements IConexionDB {
    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICĂ“ PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICĂ“ PROVEEDOR");
    }

}


