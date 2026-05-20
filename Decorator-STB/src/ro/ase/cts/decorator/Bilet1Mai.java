package ro.ase.cts.decorator;

import ro.ase.cts.clase.BiletAbstract;

public class Bilet1Mai extends BiletDecorator{
    public Bilet1Mai(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 mai!");
    }
}
