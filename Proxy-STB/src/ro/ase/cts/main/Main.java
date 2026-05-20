package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzAbstract;
import ro.ase.cts.clase.AutobuzProxy;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract a1=new Autobuz(12, "STB");
        AutobuzAbstract a2=new Autobuz(0, "N10");

        AutobuzAbstract auto1=new AutobuzProxy(a1);
        AutobuzAbstract auto2=new AutobuzProxy(a2);

        auto1.oprire();
        auto2.oprire();

    }
}
