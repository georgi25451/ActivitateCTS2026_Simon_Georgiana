package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.IAutobuz;
import ro.ase.cts.clase.ICalator;

public class Main {
    public static void main(String[] args) {

        ICalator c1=new Calator("Maria");
        ICalator c2=new Calator("Ana");

        IAutobuz a1=new Autobuz("STB");

        a1.addCalator(c1);
        a1.addCalator(c2);

        ((Autobuz)a1).notifca();


    }
}
