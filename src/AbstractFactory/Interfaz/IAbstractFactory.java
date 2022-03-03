package AbstractFactory.Interfaz;

public interface IAbstractFactory {

    /** Recibimos motor de BD */
    IConexionDB getBD(String motorBD);

    /** Recibimos REST */
    IConexionREST getREST(String areaREST);

}
