/** Clase que indica como se va a guardar el Objeto */

package Memento.memento;

public class Originator {

    private Juego estado;

    public void setEstado(Juego estado) {
        this.estado = estado;
    }

    public Juego getEstado() {
        return estado;
    }

    // Crea una nueva instancia con el estado
    public Memento guardar() {
        return new Memento(estado);
    }

    public void restaurar(Memento m) {
        this.estado = m.getEstado();
    }
}