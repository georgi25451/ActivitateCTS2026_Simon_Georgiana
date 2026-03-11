package ro.ase.cts.clase.loaders;

import ro.ase.cts.clase.StudentMedicina;
import ro.ase.cts.clase.ParticipantProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMedicinaLoader extends ParticipantiLoader {

    @Override
    public List<ParticipantProgram> load(String fisier)
            throws FileNotFoundException {

        Scanner input = new Scanner(new File(fisier));
        input.useDelimiter(",|\n");

        List<ParticipantProgram> studenti = new ArrayList<>();

        while (input.hasNext()) {

            StudentMedicina student = new StudentMedicina();

            loadParticipantData(input, student);

            int anStudiu = input.nextInt();
            String universitate = input.next();

            student.setAnStudiu(anStudiu);
            student.setUniversitate(universitate);

            studenti.add(student);
        }

        input.close();
        return studenti;
    }
}