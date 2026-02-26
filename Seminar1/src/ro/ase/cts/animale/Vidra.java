package ro.ase.cts.animale;

public class Vidra extends  Animal{

    @Override
    public void eat(String numeZookeeper) {
        System.out.println("Zookeeperul  "+numeZookeeper+"hraneste vidra "+this.name+"cu "+this.food);

    }

    public Vidra(String name, int age, String food) {
        super(name, age, food);
    }
}
