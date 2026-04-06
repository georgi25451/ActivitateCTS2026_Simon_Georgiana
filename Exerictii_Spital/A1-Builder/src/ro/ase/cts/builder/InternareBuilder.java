package ro.ase.cts.builder;

public class InternareBuilder implements AbstractBuilder{

     private Internare internare;

    private String numePacient;


    public InternareBuilder(String numePacient) {
       this.internare=new Internare(numePacient, false, false, false, false);

    }

    @Override
    public Internare build() {
        return internare;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
       this.internare.setPatRabatabil(patRabatabil);
       return  this;
    }

    @Override
    public AbstractBuilder setMicDejun(boolean micDejun) {
        this.internare.setMicDejun(micDejun);
        return this;

    }

    @Override
    public AbstractBuilder setPapuciCamera(boolean papuciCamera) {
        this.internare.setPapuciCamera(papuciCamera);
        return this;
    }

    @Override
    public AbstractBuilder setHalat(boolean halat) {
      this.internare.setHalat(halat);
      return this;
    }
}
