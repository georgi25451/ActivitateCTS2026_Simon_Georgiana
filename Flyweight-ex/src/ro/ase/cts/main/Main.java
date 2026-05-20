package ro.ase.cts.main;

import ro.ase.cts.clase.Obiectiv;
import ro.ase.cts.clase.Pictograma;
import ro.ase.cts.clase.PictogramaFactory;

public class Main {
    public static void main(String[] args) {

        Obiectiv o1=new Obiectiv("muzeu", "pitesti");

        PictogramaFactory factory=new PictogramaFactory();
        factory.getPictograma("1", "png", "roz")
                .afiseazaDetalii(o1);

    }
}
