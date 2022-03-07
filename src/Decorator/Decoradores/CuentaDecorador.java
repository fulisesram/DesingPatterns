package Decorator.Decoradores;

import Decorator.Interf.ICuentaBancaria;
import Decorator.domain.Cuenta;

public class CuentaDecorador implements ICuentaBancaria {
    protected ICuentaBancaria cuentaDecorada;

    public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        this.cuentaDecorada.abrirCuenta(c);
    }
}
