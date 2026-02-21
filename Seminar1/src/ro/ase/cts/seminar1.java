package ro.ase.cts;

import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.ZOO;
import ro.ase.cts.zoo.Zookeeper;

public class seminar1 {
    public static void main(String args[])
    {
        Zookeeper keeper=new Zookeeper("Popescu");
        ZOO zoo=new ZOO("Baneasa", keeper);
       zoo.addAnimal(new Lion("Leu1", 2, "carne", 100 ));
       zoo.addAnimal(new Zebra("Zebra4", 4, "iarba", 55));

       zoo.feedAllAnimals();
    }

}
