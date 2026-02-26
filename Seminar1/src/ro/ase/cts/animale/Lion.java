package ro.ase.cts.animale;

public class Lion extends Animal {

    private float greutate;


    @Override
    public void eat(String numeZookeeper) {
        System.out.println("Zookeeperul  "+numeZookeeper+"hraneste leul  " + this.name +"cu  "+super.food);

    }

    public Lion(String name, int age, String food, float greutate) {
        super(name, age, food);
        this.greutate = greutate;
    }
}
