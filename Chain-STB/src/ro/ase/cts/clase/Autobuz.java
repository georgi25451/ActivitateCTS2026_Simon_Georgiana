package ro.ase.cts.clase;

public class Autobuz extends Handler{
    @Override
    public String recomanda(double distanta) {
        if(distanta>3 && distanta<=5)
        {
            return "autobuz";
        }else {
            return this.handler.recomanda(distanta);
        }
    }
}
