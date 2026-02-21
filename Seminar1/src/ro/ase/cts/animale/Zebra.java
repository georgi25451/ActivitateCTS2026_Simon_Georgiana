package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int nrDungi;
    @Override
    public void eat(String str, String nume) {
        System.out.println("Zookeperul"+super.name+"hraneste zebra cu"+super.food);

    }

    public Zebra(String name, int age,String food, int nrDungi) {
        super(name, age, food);
        this.nrDungi=nrDungi;
    }

}
