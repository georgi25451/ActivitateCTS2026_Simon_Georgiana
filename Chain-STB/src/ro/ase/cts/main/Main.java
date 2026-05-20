package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {

        Handler troleibuz=new Troleibuz();
        Handler tramvai=new Tramvai();
        Handler autobuz=new Autobuz();
        Handler metrou=new Metrou();

        troleibuz.setHandler(tramvai);
        tramvai.setHandler(autobuz);
        autobuz.setHandler(metrou);

        System.out.println(troleibuz.recomanda(2));
        System.out.println(troleibuz.recomanda(4));
        System.out.println(troleibuz.recomanda(7));
        System.out.println(troleibuz.recomanda(20));
    }
}
