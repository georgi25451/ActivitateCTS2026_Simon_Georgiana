package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator implements  Command{
    private List<Command> lista;

    public Operator() {
        this.lista = new ArrayList<>();
    }

    public void addComanda(Command c)
    {
        lista.add(c);
    }
    @Override
    public void execute() {
        if(this.lista.size()>0)
        {
            this.lista.getFirst().execute();
            this.lista.removeFirst();
        }else {
            System.out.println("Nu exista comenzi...");
        }
    }
}
