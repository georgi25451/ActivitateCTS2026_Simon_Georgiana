package ro.ase.cts.clase;

public class VerificareValoare extends Handler{
    @Override
    public String verificare(Comanda c) {
        if(c.isVerificareValoare()==true)
        {
            return "Comanda valida!";
        }else {
            return "Nu exista valoare!";
        }
    }
}
