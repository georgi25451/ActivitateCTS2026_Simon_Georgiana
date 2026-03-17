package ro.ase.cts.main;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.fabrica.PersonalFactory;
import ro.ase.cts.fabrica.TipPersonal;

public class Main {

    public static void afisarePersonal(PersonalSpital p)
    {
        p.afisareDescriere();
    }

    public static void main(String[] args)
    {
            PersonalFactory factory=new PersonalFactory();

            PersonalSpital medic=factory.crearePersonale(TipPersonal.MEDIC, "Petrescu", "Alexandra", 6700);
            PersonalSpital asistent=factory.crearePersonale(TipPersonal.ASISTENT, "Toma", "Ionela", 4500);
            PersonalSpital brancadier=factory.crearePersonale(TipPersonal.BRANCARDIER, "Ioana", "Popa", 2900);

            afisarePersonal(medic);
            afisarePersonal(asistent);
            afisarePersonal(brancadier);
    }

}
