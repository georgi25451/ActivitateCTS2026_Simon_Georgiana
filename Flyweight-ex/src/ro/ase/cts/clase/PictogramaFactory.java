package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class PictogramaFactory {
    private Map<String, PictogramaAbstract> lista=new HashMap<>();

    public PictogramaFactory() {

    }
    public PictogramaAbstract getPictograma(String cheie, String imagine, String culoare)
    {
        if(!lista.containsKey(cheie))
        {
            lista.put(cheie, new Pictograma(imagine, culoare));
        }
        return lista.get(cheie);
    }
}
