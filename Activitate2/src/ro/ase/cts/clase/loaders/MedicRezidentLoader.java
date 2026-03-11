package ro.ase.cts.clase.loaders;

import ro.ase.cts.clase.MedicRezident;
import ro.ase.cts.clase.ParticipantProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicRezidentLoader extends ParticipantiLoader {

    @Override
    public List<ParticipantProgram> load(String fisier)
            throws FileNotFoundException {

        Scanner input = new Scanner(new File(fisier));
        input.useDelimiter(",|\n");

        List<ParticipantProgram> medici = new ArrayList<>();

        while (input.hasNext()) {

            MedicRezident medic = new MedicRezident();

            loadParticipantData(input, medic);

            int salariu = input.nextInt();
            String specializare = input.next();

            medic.setSalariu(salariu);
            medic.setSpecializare(specializare);

            medici.add(medic);
        }

        input.close();
        return medici;
    }
}