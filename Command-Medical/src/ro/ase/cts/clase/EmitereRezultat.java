package ro.ase.cts.clase;

public class EmitereRezultat implements Command{
    private Laborator laborator;
    private Pacient pacient;

    public EmitereRezultat(Laborator laborator, Pacient pacient) {
        this.laborator = laborator;
        this.pacient = pacient;
    }

    @Override
    public void execute() {
        this.laborator.emitereRezultat(pacient);
    }
}
