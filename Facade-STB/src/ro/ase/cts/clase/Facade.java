package ro.ase.cts.clase;

public class Facade {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public Facade() {
       this.usaFata=new UsaFata();
       this.usaSpate=new UsaSpate();
       this.usaMijloc=new UsaMijloc();
    }

    public void puneToateUsileInModLiber()
    {
        usaFata.puneInModLiber();
        usaMijloc.puneInModLiber();
        usaSpate.puneInModLiber();
    }
    public void deschideToateUsile()
    {
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
