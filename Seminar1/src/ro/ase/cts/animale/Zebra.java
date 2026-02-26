package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int nrDungi;

    @Override
    public void eat(String numeZookeeper) {
        System.out.println("Zookeperul  "+numeZookeeper+"hraneste zebra  "+this.name+ "cu  "+super.food);

    }

    public Zebra(String name, int age,String food, int nrDungi) {
        super(name, age, food);
        this.nrDungi=nrDungi;
    }

}
