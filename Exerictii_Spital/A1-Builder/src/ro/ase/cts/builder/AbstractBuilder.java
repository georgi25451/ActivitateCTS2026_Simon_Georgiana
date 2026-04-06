package ro.ase.cts.builder;

public interface AbstractBuilder {
    Internare build();

    //setters pt build:
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejun(boolean micDejun);
    AbstractBuilder setPapuciCamera(boolean papuciCamera);
    AbstractBuilder setHalat(boolean halat);

}
