package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private String nume;
    private List<ICalator> lista;

    public Autobuz(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        lista.forEach(calator->{
            calator.receptioneazaNotificare(mesaj+" de la autobuzul "+this.nume);
        });


    }

    @Override
    public void addCalator(ICalator c) {
         lista.add(c);
    }

    @Override
    public void removeCalator(ICalator c) {
        lista.remove(c);

    }

    public void notifca()
    {
        this.trimiteNotificare("Autobuzul se pune in miscare");
    }
}
