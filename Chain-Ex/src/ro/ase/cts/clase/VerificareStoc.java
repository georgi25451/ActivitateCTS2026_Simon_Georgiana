package ro.ase.cts.clase;

public class VerificareStoc extends Handler{
    @Override
    public String verificare(Comanda c) {
        if(c.isVerificareStoc()==true)
        {
            return this.handler.verificare(c);
        }else {
            return "Nu e stoc!";
        }
    }
}
