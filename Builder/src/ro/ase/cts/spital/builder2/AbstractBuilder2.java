package ro.ase.cts.spital.builder2;

public interface AbstractBuilder2 {
    Internare buid(String nume);
    AbstractBuilder2 setPatRabatabil(boolean arePatRabatabil);
    AbstractBuilder2 setHalat(boolean areHalat);
    AbstractBuilder2 setPapuci(boolean arePapuci);
    AbstractBuilder2 setMicDeJun(boolean areMicDeJun);
}
