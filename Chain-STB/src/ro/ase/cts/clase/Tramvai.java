package ro.ase.cts.clase;

public class Tramvai extends Handler{
    @Override
    public String recomanda(double distanta) {

        if(distanta>5 && distanta<=10)
        {
            return "tramvai";
        }else {
            return this.handler.recomanda(distanta);
        }
    }
}
