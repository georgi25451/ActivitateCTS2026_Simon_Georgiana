package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Pacient p1=new Pacient("Ana");
        Laborator l1=new Laborator();
        Command c1=new RecoltareAnalize(l1, p1);
        Command c2=new EmitereRezultat(l1, p1);
        Operator operator=new Operator();
        operator.addComanda(c1);
        operator.addComanda(c2);
        operator.execute();
        operator.execute();
        operator.execute();

    }
}
