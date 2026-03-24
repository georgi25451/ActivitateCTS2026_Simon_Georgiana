package ro.ase.cts.program;

import ro.ase.cts.prototype.IRezervare;
import ro.ase.cts.prototype.Rezervare;

public class Main {
    public static void main(String[] args) throws Exception
    {
        IRezervare rez1=new Rezervare("0789876512", "11/12/2024", 2, "Andrei");

        IRezervare rez2=rez1.copy();

        ((Rezervare) rez2).setData("5/5/2025");
        ((Rezervare) rez2).setNrPersoane(29);

        System.out.println("Rezervarea 1: \n"+ rez1);
        System.out.println("Rezervarea 2: \n"+ rez2);
    }
}
