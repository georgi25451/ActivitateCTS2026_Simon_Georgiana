package ro.ase.cts.fabrica;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;

public class PersonalFactory {

    public PersonalSpital crearePersonale(TipPersonal tip, String nume, String prenume, float salariu)
    {
        switch (tip){
            case MEDIC:
                return new Medic(nume, prenume, salariu);

            case ASISTENT:
                return  new Asistent(nume, prenume, salariu);
            case BRANCARDIER:
                return new Brancardier(nume, prenume, salariu);
            default: return null;

        }
    }

}
