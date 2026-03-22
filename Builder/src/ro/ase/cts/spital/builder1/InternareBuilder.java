package ro.ase.cts.spital.builder1;

public class InternareBuilder implements AbstractBuilder{
    //delacram Internare de tip private
    private Internare internare;

    public InternareBuilder(String nume)
    {
        this.internare=new Internare(nume, false, false, false, false);
    }
    @Override
    public Internare buid() {
        return internare;
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNume(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean arePatRabatabil) {
       this.internare.setArePatRabatabil(arePatRabatabil);
       return this;
    }

    @Override
    public AbstractBuilder setHalat(boolean areHalat) {
        this.internare.setAreHalat(areHalat);
        return this;
    }

    @Override
    public AbstractBuilder setPapuci(boolean arePapuci) {
        this.internare.setArePapuciCamera(arePapuci);
        return this;
    }

    @Override
    public AbstractBuilder setMicDeJun(boolean areMicDeJun) {
        this.internare.setAreMicDeJun(areMicDeJun);
        return this;
    }
}
