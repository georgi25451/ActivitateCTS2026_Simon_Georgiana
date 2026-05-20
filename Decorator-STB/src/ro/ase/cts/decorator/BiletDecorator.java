package ro.ase.cts.decorator;

import ro.ase.cts.clase.BiletAbstract;

public abstract class BiletDecorator implements BiletAbstract {
    private BiletAbstract bilet;

    public BiletDecorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
        this.printeazaFelicitare();
    }

    public abstract void printeazaFelicitare();
}
