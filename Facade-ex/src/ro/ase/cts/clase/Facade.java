package ro.ase.cts.clase;

public class Facade {
    private VerificaDisponibilitate disponibilitate;
    private VerificaRezervare rezervare;
    private InregistreazaDate date;

    public Facade() {
        this.disponibilitate=new VerificaDisponibilitate();
        this.date=new InregistreazaDate();
        this.rezervare=new VerificaRezervare();
    }

    public void rezervare(Client client)
    {
        this.disponibilitate.verificaDisponibiliatte();
        this.rezervare.verificaRezervare(client);
        this.date.inregistteazaDate(client);
    }
}
