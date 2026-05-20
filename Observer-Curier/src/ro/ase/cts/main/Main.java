package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Curier;
import ro.ase.cts.clase.IClient;
import ro.ase.cts.clase.ICurier;

public class Main {
    public static void main(String[] args) {
        IClient c1=new Client("Ana");
        IClient c2=new Client("Maria");

        ICurier curier=new Curier("FanCourier");

        curier.addClient(c1);
        curier.addClient(c2);

        ((Curier)curier).notificaLivrare();
        ((Curier)curier).notificaTranzit();
    }
}
