package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Plata;
import ro.ase.cts.clase.PlataCard;

public class Main {
    public static void main(String[] args) {


        Client c1=new Client("Ana");
        Client c2=new Client("Ion");
        c1.setPlata(new PlataCard());

        c1.achita();
        c2.achita();

    }
}
