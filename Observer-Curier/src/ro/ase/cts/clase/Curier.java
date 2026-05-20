package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Curier implements ICurier{
    private String nume;
    private List<IClient> lista;

    public Curier(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        lista.forEach(client->{
            client.receptioneazaMesaj(mesaj+" de la: "+this.nume);
        });
    }

    @Override
    public void addClient(IClient c) {
        lista.add(c);

    }

    @Override
    public void removeClient(IClient c) {
        lista.remove(c);

    }

    public void notificaLivrare()
    {
        this.trimiteMesaj(" -Colet livrat- ");
    }

    public void notificaTranzit()
    {
        this.trimiteMesaj(" -Colet in tranzit- ");
    }

}
