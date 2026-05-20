package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {

        Comanda c1=new Comanda("lapte", true, true, true, true);
        Comanda c2=new Comanda("paine", true, true, false, true);

        Handler stoc=new VerificareStoc();
        Handler adresa=new VerificareAdresa();
        Handler metoda=new VerificareMetoda();
        Handler valoare=new VerificareValoare();

        stoc.setHandler(adresa);
        adresa.setHandler(metoda);
        metoda.setHandler(valoare);

        System.out.println(stoc.verificare(c1));
        System.out.println(stoc.verificare(c2));
    }
}
