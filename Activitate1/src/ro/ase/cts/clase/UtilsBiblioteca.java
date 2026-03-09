package ro.ase.cts.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilsBiblioteca {

    public static List<Student> readStudenti(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Student> studenti = new ArrayList<Student>();

        while (input.hasNext()) {
            String nume = input.next();
            String prenume = (input.next()).toString();
            int varsta = Integer.valueOf(input.nextInt());
            int punctaj = Integer.valueOf(input.nextInt());
            int nr = Integer.valueOf(input.nextInt());
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input.next();
            int anStudiu = input.nextInt();
            String facultate = (input.next()).toString();
            Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, anStudiu);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }

    public static List<Profesor> readProfesori(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\\r?\\n");
        List<Profesor> profesori = new ArrayList<Profesor>();

        while (input2.hasNext()) {
            String nume = input2.next().trim();
            String prenume = input2.next().trim();
            int varsta = input2.nextInt();
            int punctaj = input2.nextInt();
            int nr = input2.nextInt();
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input2.next();
            int salariu = input2.nextInt();
            String departament = input2.next().trim();
            Profesor p = new Profesor(nume, prenume, varsta, punctaj, nr, vect, salariu, departament);
            profesori.add(p);
        }
        input2.close();
        return profesori;
    }

    public static List<Elev> readElevi(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Elev> elevi = new ArrayList<Elev>();

        while (input2.hasNext()) {
            String nume = input2.next();
            String prenume = input2.next();
            int varsta = input2.nextInt();
            int punctaj = input2.nextInt();
            int nr = input2.nextInt();
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input2.next();
            int clasa = input2.nextInt();
            String profesor = input2.next();
            Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, profesor);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }

    public static void readAll() {
        List<Elev> listaElevi;
        List<Student> listaStudenti;
        List<Profesor> listaProfesori;

        try {
            System.out.println("citireeeeeeeeeeeeeeeeee");

            listaElevi = UtilsBiblioteca.readElevi("elevi_biblioteca.txt");
            for (int i = 0; i < listaElevi.size(); i++)
                System.out.println(listaElevi.get(i).toString());

            listaStudenti = UtilsBiblioteca.readStudenti("studenti_biblioteca.txt");
            for (int i = 0; i < listaStudenti.size(); i++)
                System.out.println(listaStudenti.get(i).toString());

            listaProfesori = UtilsBiblioteca.readProfesori("profesori_biblioteca.txt");
            for (int i = 0; i < listaProfesori.size(); i++)
                System.out.println(listaProfesori.get(i).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
