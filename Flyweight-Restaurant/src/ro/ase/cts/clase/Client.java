package ro.ase.cts.clase;

public class Client implements ClientAbstract{

    private String nume;
    private String nrTel;

    public Client(String nume, String nrTel) {
        this.nume = nume;
        this.nrTel = nrTel;
    }

    @Override
    public void afiseazaInfo(Rezervare rezervare) {
        System.out.println(rezervare.toString());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
