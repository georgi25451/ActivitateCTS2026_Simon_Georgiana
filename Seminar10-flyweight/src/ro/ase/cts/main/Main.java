package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Mercedes",2003,23);
        Autobuz a2 = new Autobuz("Opel",2020,30);
        Autobuz a3 = new Autobuz("Model auto",2021,28);
        LinieFactory factory = new LinieFactory();
        factory.getLinieDeTransport(102,"CFR","Dristor")
                .afiseazaAutobuzLinie(a1);
    }
}
