package ro.ase.cts.clase;

public class Autobuz {
    private int nr;

    public Autobuz(int nr) {
        this.nr = nr;
    }

    public void plecare(int nrLinie)
    {
        System.out.println("Autobuzul "+this.nr+" pleaca pe linia: "+nrLinie);
    }
}
