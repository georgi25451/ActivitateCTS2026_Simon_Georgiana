package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.LivrareRapida;
import ro.ase.cts.clase.RidicarePersonala;

public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Ana");
        Client c2=new Client("Ion");
        Client c3=new Client("Maria");

        c2.setLivrare(new LivrareRapida());
        c3.setLivrare(new RidicarePersonala());

        c1.efectueazaLivrare();
        c2.efectueazaLivrare();
        c3.efectueazaLivrare();
    }
}
