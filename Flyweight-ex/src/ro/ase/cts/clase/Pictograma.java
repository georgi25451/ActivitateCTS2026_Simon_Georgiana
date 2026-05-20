package ro.ase.cts.clase;

public class Pictograma implements PictogramaAbstract{
    private String imagine;
    private String culoare;

    public Pictograma(String imagine, String culoare) {
        this.imagine = imagine;
        this.culoare = culoare;
    }

    @Override
    public void afiseazaDetalii(Obiectiv obiectiv) {
        System.out.println(obiectiv.toString());
        System.out.println( this.toString());

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pictograma{");
        sb.append("imagine='").append(imagine).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
