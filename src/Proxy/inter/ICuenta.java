package Proxy.inter;

import Proxy.model.Cuenta;

public interface ICuenta {

    Cuenta retirarDinero(Cuenta cuenta, double monto);
    Cuenta depositarDinero(Cuenta cuenta, double monto);
    void mostrarSaldo(Cuenta cuenta);

}
