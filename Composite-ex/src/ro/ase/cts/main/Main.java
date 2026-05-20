package ro.ase.cts.main;

import ro.ase.cts.clase.Meniu;
import ro.ase.cts.clase.Produs;
import ro.ase.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura produs1=new Produs("apa", 5);
        Structura produs2=new Produs("cafea", 5);

        Structura meniu=new Meniu("Bauturi");
        ((Meniu)meniu).add(produs1);
        ((Meniu)meniu).add(produs2);

        meniu.afiseazaDetalii();
        meniu.calculeazaPretTotal();
    }
}
