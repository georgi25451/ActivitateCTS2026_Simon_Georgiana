package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.clase.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana", 7);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if (pacient.getGravitate() > 6) {
            if (medic.areInregistratPacientul(pacient)) {
                int pat = salon.getPatLiber();
                if (salon.getPatLiber() != -1) {
                    System.out.println("Pacientul " + pacient.getNume() + " e internat in patul: " + pat);
                    salon.ocupaPat(pat);
                }
            }
        }

        Pacient pacient1=new Pacient("Mirel", 4);
        Pacient pacient2=new Pacient("Aurel", 7);
        Pacient pacient3=new Pacient("Ioana", 2);

        SpitalFacade spital=new SpitalFacade(medic, salon);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);

    }
}
