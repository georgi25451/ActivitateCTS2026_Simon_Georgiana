package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

public class Zookeeper {
    private String numeZookeeper;

    public void feedAniaml(Animal animal)
    {
        animal.eat( numeZookeeper);
    }

    public Zookeeper(String numeZookeeper) {
        this.numeZookeeper = numeZookeeper;

    }
}
