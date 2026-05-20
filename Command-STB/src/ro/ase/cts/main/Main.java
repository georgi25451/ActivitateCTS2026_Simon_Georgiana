package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Command;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.PlecareAutobuz;

public class Main {
    public static void main(String[] args) {

        Autobuz a1=new Autobuz(255);
        Autobuz a2=new Autobuz(105);

        Command plecare1=new PlecareAutobuz(a1, 104);
        Command plecare2=new PlecareAutobuz(a2, 100);
        Command plecare3=new PlecareAutobuz(a1, 110);

        Operator operator=new Operator();
        operator.addComanda(plecare1);
        operator.addComanda(plecare2);
        operator.addComanda(plecare3);

        operator.execute();
        operator.execute();
        operator.execute();
        operator.execute();

    }
}
