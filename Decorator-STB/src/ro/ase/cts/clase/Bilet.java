package ro.ase.cts.clase;

public class Bilet implements BiletAbstract{
    private String nume;
    private String data;
    private double suma;

    public Bilet(String nume, String data, double suma) {
        this.nume = nume;
        this.data = data;
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("La data de: "+this.data+" ,"+this.nume+" a achiatta suma de: "+this.suma);
    }
}
