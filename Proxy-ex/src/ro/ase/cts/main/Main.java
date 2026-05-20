package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractCarte;
import ro.ase.cts.clase.Carte;
import ro.ase.cts.clase.CarteProxy;
import ro.ase.cts.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Ana", true);
        Student s2=new Student("Ion", false);

        AbstractCarte carte1=new Carte();
        AbstractCarte carteProxy=new CarteProxy(carte1);
        carteProxy.imprumuta(s1);
        carteProxy.imprumuta(s2);
    }
}
