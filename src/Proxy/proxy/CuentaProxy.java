package Proxy.proxy;

import Proxy.inter.ICuenta;
import Proxy.inter.impl.CuentaBancoAImpl;
import Proxy.inter.impl.CuentaBancoBImpl;
import Proxy.model.Cuenta;
import java.util.logging.Logger;

public class CuentaProxy implements ICuenta{

    // private CuentaBancoAImpl cuentaReal; -> aqui esta amarrado a la implementacion del banco A
    private ICuenta cuentaReal; // -> aqui llamamos primero a la interfaz
    private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());

    /** Aqui hacemos la implentacion de la interface con un constructor
     * la cuentaReal sera la que por parametros */
    public CuentaProxy(CuentaBancoBImpl cuentaReal) {
        this.cuentaReal = cuentaReal;
    }

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.retirarDinero(cuenta, monto);
        } else {
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.depositarDinero(cuenta, monto);
        } else {
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            cuentaReal.mostrarSaldo(cuenta);
        } else {
            cuentaReal.mostrarSaldo(cuenta);
        }
    }

}


