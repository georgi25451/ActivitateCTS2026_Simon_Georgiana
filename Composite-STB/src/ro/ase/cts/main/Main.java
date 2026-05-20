package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.GrupAutobuz;
import ro.ase.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura s1=new GrupAutobuz("Grup mic");
        Structura a1=new Autobuz("lala", "lala", 12);
        Structura a2=new Autobuz("lala", "lala", 12);
        Structura a3=new Autobuz("lala", "lala", 12);

        ((GrupAutobuz)s1).add(a1);
        ((GrupAutobuz)s1).add(a2);
        ((GrupAutobuz)s1).add(a3);

        s1.afiseazaDetalii();
    }

}
