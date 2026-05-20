package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz a1=new Autobuz("Mercedes", 23, 2003);
        Autobuz a2=new Autobuz("Mercedes", 23, 2003);
        Autobuz a3=new Autobuz("Mercedes", 23, 2003);

        LinieFactory factory=new LinieFactory();
        factory.getLinieDeTransport(102, "CFR", "Cfr")
                .afiseazaAutobuzLinie(a1);

    }
}
