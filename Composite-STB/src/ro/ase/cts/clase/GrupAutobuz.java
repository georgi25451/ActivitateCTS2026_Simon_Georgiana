package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuz implements  Structura{
    private String numeGrup;
    private List<Structura> lista;

    public GrupAutobuz(String numeGrup) {
        this.numeGrup = numeGrup;
        this.lista = new ArrayList<>();
    }

    public void add(Structura structura)
    {
        lista.add(structura);
    }

    public void remove(Structura structura)
    {
        lista.remove(structura);
    }

    public List<Structura> getLista() {
        return lista;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Grup: "+this.numeGrup);
        for(Structura s:lista)
        {
            s.afiseazaDetalii();
        }
    }
}
