package ro.ase.cts.clase;

public class CarteProxy implements AbstractCarte{
    private AbstractCarte carte;

    public CarteProxy(AbstractCarte carte) {
        this.carte = carte;
    }

    @Override
    public void imprumuta(Student student) {
        if(student.isAreTaxePlatite()==true)
        {
            this.carte.imprumuta(student);
        }else {
            System.out.println("Studentul nu are taxele, platite si nu poate implementa");
        }
    }
}
