package ro.ase.cts.clase.loaders;

import ro.ase.cts.clase.ParticipantProgram;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ParticipantiLoader {

    public abstract List<ParticipantProgram> load(String fisier)
            throws FileNotFoundException;

    public void loadParticipantData(Scanner input, ParticipantProgram participant) {

        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();

        String[] activitati = new String[nr];
        for (int i = 0; i < nr; i++) {
            activitati[i] = input.next();
        }

        participant.setNume(nume);
        participant.setPrenume(prenume);
        participant.setVarsta(varsta);
        participant.setPunctaj(punctaj);
        participant.setNrActivitati(nr);
        participant.setActivitati(activitati);
    }
}