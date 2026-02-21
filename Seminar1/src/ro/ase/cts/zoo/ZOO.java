package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String name;
    private Zookeeper zookeeper;
    private List<Animal> listaAnimale;

    public ZOO(String name, Zookeeper zookeeper) {
        this.name = name;
        this.zookeeper = zookeeper;
        this.listaAnimale = new ArrayList<>();
    }

    public void addAnimal(Animal animal)
    {
        listaAnimale.add(animal);
    }

    public void feedAllAnimals()
    {
        for(Animal a:listaAnimale)
        {
            zookeeper.feedAniaml(a);
        }
    }


}
