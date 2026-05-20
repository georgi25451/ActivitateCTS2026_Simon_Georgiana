package ro.ase.cts.clase;

public class AutobuzProxy implements AutobuzAbstract{
    private AutobuzAbstract auto;

    public AutobuzProxy(AutobuzAbstract auto) {
        this.auto = auto;
    }

    @Override
    public void oprire() {
        if(this.auto.getNrCalatori()>0)
        {
            this.auto.oprire();
        }else {
            System.out.println("Nu exista calatori");
        }
    }

    @Override
    public int getNrCalatori() {
        return this.auto.getNrCalatori();
    }
}
