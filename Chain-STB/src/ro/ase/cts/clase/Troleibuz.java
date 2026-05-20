package ro.ase.cts.clase;

public class Troleibuz extends Handler{
    @Override
    public String recomanda(double distanta) {
        if(distanta<3)
        {
            return "troleibuz";
        }else {
            return this.handler.recomanda(distanta);
        }
    }
}
