package ro.ase.cts.main;

import ro.ase.cts.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        System.out.println("MOD LIBER: ");
        facade.puneToateUsileInModLiber();
        System.out.println("DESCHIDERE FORTATA: ");
        facade.deschideToateUsile();
    }
}
