package ro.ase.cts.main;

import java.io.FileNotFoundException;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.loaders.AngajatiLoaders;
import ro.ase.cts.clase.loaders.AplicantiLoaders;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        AplicantiLoaders loader = new AngajatiLoaders();

        try {
            for(Aplicant angajat : loader.load("Seminar2/angajati.txt")) {
                System.out.println(angajat.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
