package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ana");

        Facade facade=new Facade();
        facade.rezervare(client);
    }
}
