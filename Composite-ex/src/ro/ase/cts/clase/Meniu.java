package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements Structura{
    private String nume;
    private List<Structura> lista;

    public Meniu(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public void add(Structura s)
    {
        lista.add(s);
    }
    public void remove(Structura s)
    {
        lista.remove(s);
    }

    public List<Structura> getLista() {
        return lista;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Meniu: "+this.nume);
        for(Structura s:lista)
        {
            s.afiseazaDetalii();
        }
    }

    @Override
    public void calculeazaPretTotal() {
        double suma=0;
        for(Structura s:lista)
        {
            suma=suma+s.getPret();
        }
        System.out.println("Total: "+suma);

    }

    @Override
    public double getPret() {
        return 0;
    }
}
