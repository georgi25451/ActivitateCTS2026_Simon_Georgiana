package ro.ase.cts.clase;

public class VerificareAdresa extends Handler{
    @Override
    public String verificare(Comanda c) {
       if(c.isVerificareAdresa()==true)
       {
           return this.handler.verificare(c);
       }else {
           return "Nu exista adresa!";
       }
    }
}
