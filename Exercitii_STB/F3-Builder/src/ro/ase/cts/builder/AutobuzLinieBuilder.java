package ro.ase.cts.builder;

public class AutobuzLinieBuilder implements AbstractBuilder{
    private AutobuzLinie autobuzLinie;

    public AutobuzLinieBuilder(String model, String sofer) {
       this.autobuzLinie=new AutobuzLinie(model, sofer, false, false,  "STB");
    }

    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }



    @Override
    public AbstractBuilder setOprireCapat(boolean oprireCapat) {
       this.autobuzLinie.setOprireCapat(oprireCapat);
       return this;
    }

    @Override
    public AbstractBuilder setDeschidereUsiAutomate(boolean deschidereUsiAutomate) {
        this.autobuzLinie.setDeschidereUsiAutomate(deschidereUsiAutomate);
        return this;
    }

    @Override
    public AbstractBuilder setTextDerulator(String text) {
        this.autobuzLinie.setTextDerulator(text);
        return this;
    }
}
