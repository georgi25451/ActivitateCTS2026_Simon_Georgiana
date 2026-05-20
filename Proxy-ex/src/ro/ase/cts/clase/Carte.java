package ro.ase.cts.clase;

public class Carte implements AbstractCarte{
    @Override
    public void imprumuta(Student student) {
        System.out.println("Cartea a fost imprumutata de "+student.getNume());
    }
}
