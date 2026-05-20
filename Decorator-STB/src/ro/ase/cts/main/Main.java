package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletAbstract;
import ro.ase.cts.decorator.Bilet1Dec;
import ro.ase.cts.decorator.Bilet1Mai;
import ro.ase.cts.decorator.BiletDecorator;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet=new Bilet("Ana", "01.12.2026", 25);
        bilet.printeaza();

        BiletDecorator bilet1=new Bilet1Mai(new Bilet("Ion", "01.05.2026", 45));
        BiletDecorator bilet2=new Bilet1Dec(new Bilet("Maria", "01.12.2026", 48));

        bilet1.printeaza();
        bilet2.printeaza();


    }
}
