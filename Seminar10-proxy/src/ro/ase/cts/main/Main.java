package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzNoapte;
import ro.ase.cts.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("89",20);
        autobuz.opresteInStatie();
        autobuz.opresteInStatie();

        MijlocTransport autobuzDeNoapte = new AutobuzNoapte(autobuz);

        autobuzDeNoapte.opresteInStatie();

        MijlocTransport autobuzGol = new AutobuzNoapte(
                new Autobuz("205",0));
        autobuzGol.opresteInStatie();

        MijlocTransport autobuzCursaSpeciala = new AutobuzCursaSpeciala(
                new Autobuz("Cursa speciala",10)
        );
        autobuzCursaSpeciala.opresteInStatie();
    }

}
