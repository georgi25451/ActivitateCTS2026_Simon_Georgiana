package ro.ase.cts.animale;

public class Lion extends Animal {

    private float greutate;
    @Override
    public void eat(String str, String nume) {
        System.out.println("Zookeeperul"+super.name+"hraneste leul cu"+super.food);

    }

    public Lion(String name, int age, String food, float greutate) {
        super(name, age, food);
        this.greutate = greutate;
    }
}
