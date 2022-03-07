package Decorator;

import Decorator.Decoradores.BlindajeDecorador;
import Decorator.Interf.ICuentaBancaria;
import Decorator.Interf.Impl.CuentaAhorro;
import Decorator.domain.Cuenta;

public class main {

        public static void main(String[] args) {
            Cuenta c = new Cuenta(1, "Fabian Ramirez");

            ICuentaBancaria cuenta = new CuentaAhorro();
            ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

            //cuenta.abrirCuenta(c);
            cuentaBlindada.abrirCuenta(c);
        }
}
