package Memento.memento;

import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> mementos = new ArrayList<>();

    /* Recibe el Objeto memento que se guardo desde Originator
    * y se agrega a un arrayList */
    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}