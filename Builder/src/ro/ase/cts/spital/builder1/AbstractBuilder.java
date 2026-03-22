package ro.ase.cts.spital.builder1;

public interface AbstractBuilder {

    //abstract builder!!!

    Internare buid();
    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatabil(boolean arePatRabatabil);
    AbstractBuilder setHalat(boolean areHalat);
    AbstractBuilder setPapuci(boolean arePapuci);
    AbstractBuilder setMicDeJun(boolean areMicDeJun);
}
