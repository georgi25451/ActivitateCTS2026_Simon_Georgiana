package ro.ase.cts.main;
import ro.ase.cts.clase.*;

import java.io.FileNotFoundException;
import java.util.List;

public class ProgramBiblioteca {
    public static void main(String[] args) {
        List<Profesor> listaProfesori;
        List<Elev> listaElevi;
        List<Student> listaStudenti;
        try {
            listaProfesori = UtilsBiblioteca.readProfesori("Activitate1/profesori.txt");
            for (Profesor profesor : listaProfesori) {
                System.out.println(profesor.toString());
                profesor.afisareInformatiiTaxa();

            }
            System.out.println("\n");
            listaElevi=UtilsBiblioteca.readElevi("Activitate1/elevi.txt");
            for(Elev elev:listaElevi)
            {
                System.out.println(elev.toString());
                elev.afisareInformatiiTaxa();
            }
            System.out.println("\n");
            listaStudenti=UtilsBiblioteca.readStudenti("Activitate1/studenti.txt");
            for(Student student:listaStudenti)
            {
                System.out.println(student.toString());
                student.afisareInformatiiTaxa();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
