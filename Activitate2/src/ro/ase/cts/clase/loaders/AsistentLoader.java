package ro.ase.cts.clase.loaders;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.ParticipantProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsistentLoader extends ParticipantiLoader {

    @Override
    public List<ParticipantProgram> load(String fisier)
            throws FileNotFoundException {

        Scanner input = new Scanner(new File(fisier));
        input.useDelimiter(",|\n");

        List<ParticipantProgram> asistenti = new ArrayList<>();

        while (input.hasNext()) {

            Asistent asistent = new Asistent();

            loadParticipantData(input, asistent);

            String sectie = input.next();
            String tura = input.next();

            asistent.setSectie(sectie);
            asistent.setTura(tura);

            asistenti.add(asistent);
        }

        input.close();
        return asistenti;
    }
}