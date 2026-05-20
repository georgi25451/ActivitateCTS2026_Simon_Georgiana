package ro.ase.cts.clase;

public class Client {
    private String nume;
    private Plata plata;

    public Client(String nume) {
        this.nume = nume;
        this.plata=new PlataSMS();
    }

    public Client(String nume, Plata plata) {
        this.nume = nume;
        this.plata = plata;
    }

    public void setPlata(Plata plata) {
        this.plata = plata;
    }

    public void achita()
    {
        System.out.println("Clientul: "+this.nume+" plateste: "+this.plata.plateste());
    }
}
