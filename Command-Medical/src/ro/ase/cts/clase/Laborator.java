package ro.ase.cts.clase;

public class Laborator {
    public void recolteazaAnalize(Pacient pacient)
    {
        System.out.println("Se recolteaza analize pt: "+pacient.getNume());
    }

    public void emitereRezultat(Pacient pacient)
    {
        System.out.println("Se emite rezultat pt: "+pacient.getNume());
    }
}
