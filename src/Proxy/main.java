package Proxy;

import Proxy.inter.ICuenta;
import Proxy.inter.impl.CuentaBancoAImpl;
import Proxy.inter.impl.CuentaBancoBImpl;
import Proxy.model.Cuenta;
import Proxy.proxy.CuentaProxy;

public class main {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "mitocode", 100);
/** Aqui al momento de instanciar la cuentaProxy se indica la  implementacion*/
        ICuenta cuentaProxy = (ICuenta) new CuentaProxy(new CuentaBancoBImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);

    }

}
