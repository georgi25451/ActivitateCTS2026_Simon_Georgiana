package ro.ase.cts.spital.builder2;

public class InternareBuilder2 implements AbstractBuilder2 {
    private boolean arePatRabatabil;
    private boolean areMicDeJun;
    private boolean arePapuciCamera;
    private boolean areHalat;

    public InternareBuilder2() {
        this.arePatRabatabil = false;
        this.areMicDeJun = false;
        this.arePapuciCamera = false;
        this.areHalat = false;
    }

    @Override
    public Internare buid(String nume) {
        return new Internare(nume, arePatRabatabil, areMicDeJun, arePapuciCamera, areHalat);
    }

    @Override
    public AbstractBuilder2 setPatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder2 setHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public AbstractBuilder2 setPapuci(boolean arePapuci) {
        this.arePapuciCamera = arePapuci;
        return this;
    }

    @Override
    public AbstractBuilder2 setMicDeJun(boolean areMicDeJun) {
        this.areMicDeJun = areMicDeJun;
        return this;
    }
}
