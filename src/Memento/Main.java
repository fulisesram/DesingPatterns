package Memento;

import Memento.memento.Caretaker;
import Memento.memento.Juego;
import Memento.memento.Originator;

public class Main {

    public static void main(String[] args) {
        String nombreJuego = "Crash Bandicoot";

        Juego juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(1);

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(2);
        originator.setEstado(juego);

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(3);
        originator.setEstado(juego);

        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(4);

        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(5);
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

        originator.setEstado(juego);
        originator.restaurar(caretaker.getMemento(0));

        juego = originator.getEstado();
        System.out.println(juego);
    }

}