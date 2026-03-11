package ro.ase.cts.main;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.MedicRezident;
import ro.ase.cts.clase.ParticipantProgram;
import ro.ase.cts.clase.StudentMedicina;
import ro.ase.cts.clase.loaders.AsistentLoader;
import ro.ase.cts.clase.loaders.MedicRezidentLoader;
import ro.ase.cts.clase.loaders.ParticipantiLoader;
import ro.ase.cts.clase.loaders.StudentMedicinaLoader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        try {
            ParticipantiLoader loader = new MedicRezidentLoader();

            //medici
            List<ParticipantProgram> participanti =
                    loader.load("Activitate2/medici.txt");

            for (ParticipantProgram p : participanti) {
                System.out.println(p);
                System.out.println(p.getMesajStatus());
            }


            //asistenti
            ParticipantiLoader asistentLoader = new AsistentLoader();
            List<ParticipantProgram> asistenti =
                    asistentLoader.load("Activitate2/asistenti.txt");

            for (ParticipantProgram p : asistenti) {
                System.out.println(p);
                System.out.println(p.getMesajStatus());
            }


            //studenti
            ParticipantiLoader studentLoader = new StudentMedicinaLoader();
            List<ParticipantProgram> studenti =
                    studentLoader.load("Activitate2/studenti_med.txt");

            for (ParticipantProgram p : studenti) {
                System.out.println(p);
                System.out.println(p.getMesajStatus());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
