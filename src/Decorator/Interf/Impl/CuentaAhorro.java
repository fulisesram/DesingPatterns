package Decorator.Interf.Impl;

import Decorator.Interf.ICuentaBancaria;
import Decorator.domain.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {
    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("-------------------------");
        System.out.println("Se abrió una cuenta de Ahorros");
        System.out.println("Cliente: " + c.getCliente());
    }
}
