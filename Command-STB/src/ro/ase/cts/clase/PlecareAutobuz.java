package ro.ase.cts.clase;

public class PlecareAutobuz implements Command{
    private Autobuz autobuz;
    private int nrLinie;

    public PlecareAutobuz(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void execute() {
        autobuz.plecare(nrLinie);
    }
}
