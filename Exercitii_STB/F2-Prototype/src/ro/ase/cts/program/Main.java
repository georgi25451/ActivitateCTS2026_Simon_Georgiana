package ro.ase.cts.program;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;


public class Main {
    public static void main(String[] args)
    {
        Autobuz prototipAutobuz=new Autobuz("A1", 80);

        MijlocTransport m1=prototipAutobuz.clone();
        m1.setLinie("101");

        MijlocTransport m2=prototipAutobuz.clone();
        m2.setLinie("202");

        System.out.println(m1.afiseazaDetalii());
        System.out.println(m2.afiseazaDetalii());
    }
}
