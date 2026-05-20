package ro.ase.cts.clase;

public class RecoltareAnalize implements Command{
    private Laborator laborator;
    private Pacient pacient;

    public RecoltareAnalize(Laborator laborator, Pacient pacient) {
        this.laborator = laborator;
        this.pacient = pacient;
    }

    @Override
    public void execute() {
        this.laborator.recolteazaAnalize(pacient);
    }
}
