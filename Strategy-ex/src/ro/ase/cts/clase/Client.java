package ro.ase.cts.clase;

public class Client {
    private String nume;
    private LivrareAbstract livrare;

    public Client(String nume) {
        this.nume = nume;
        this.livrare=new LivrareStandard();
    }

    public Client(String nume, LivrareAbstract livrare) {
        this.nume = nume;
        this.livrare = livrare;
    }

    public void setLivrare(LivrareAbstract livrare) {
        this.livrare = livrare;
    }

    public void efectueazaLivrare()
    {
        System.out.println("Clientul: "+this.nume+" a ales metoda de livrare: "+this.livrare.livrare());
    }

}
