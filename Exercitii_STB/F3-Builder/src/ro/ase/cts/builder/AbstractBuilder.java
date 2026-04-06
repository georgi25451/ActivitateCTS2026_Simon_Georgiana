package ro.ase.cts.builder;

public interface AbstractBuilder {

    AutobuzLinie build(); //metoda pt BUILDER!


    AbstractBuilder setOprireCapat(boolean oprireCapat);
    AbstractBuilder setDeschidereUsiAutomate(boolean deschidereUsiAutomate);
    AbstractBuilder setTextDerulator(String text);


}
