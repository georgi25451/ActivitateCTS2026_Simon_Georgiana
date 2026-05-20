package ro.ase.cts.decorator;

import ro.ase.cts.clase.BiletAbstract;

public class Bilet1Dec extends BiletDecorator{
    public Bilet1Dec(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 dec!");
    }
}
