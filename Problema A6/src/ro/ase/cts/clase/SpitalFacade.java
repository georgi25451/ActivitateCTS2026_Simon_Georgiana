package ro.ase.cts.clase;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient)
    {
        if (pacient.getGravitate() > 6) {
            if (medic.areInregistratPacientul(pacient)) {
                int pat = salon.getPatLiber();
                if (salon.getPatLiber() != -1) {
                    System.out.println("Pacientul " + pacient.getNume() + " e internat in patul: " + pat);
                    salon.ocupaPat(pat);
                }else {
                    System.out.println("Nu exista disponibilitate");
                }
            }else {
                System.out.println("Este nevoie de trimitere de la medic pt a fi inregistrat");
            }
        }else {
            System.out.println("Nu e atat de grav");
        }
    }
}
