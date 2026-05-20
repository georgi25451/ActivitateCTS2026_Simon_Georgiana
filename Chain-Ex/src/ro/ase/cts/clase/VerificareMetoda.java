package ro.ase.cts.clase;

public class VerificareMetoda extends Handler{
    @Override
    public String verificare(Comanda c) {
       if(c.isVerificareMetoda()==true)
       {
           return this.handler.verificare(c);
       }else {
           return "Nu exista metoda!";
       }
    }
}
