package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ClientAbstract;
import ro.ase.cts.clase.ClientFactory;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        Rezervare r1=new Rezervare(4, "01.04.2025");
        Rezervare r2=new Rezervare(2, "0456");

        ClientFactory factory=new ClientFactory();
        ClientAbstract  c1=factory.getClient("Ana", "078989");
        ClientAbstract c2=factory.getClient("Ana", "078989");

        c1.afiseazaInfo(r1);
        c1.afiseazaInfo(r2);

    }
}
