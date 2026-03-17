package ro.ase.cts.main;

import ro.ase.cts.clase.Supa;
import ro.ase.cts.fabrica.FabricaSupa;
import ro.ase.cts.fabrica.SupaType;

public class Main {
    public static void afisareSupa(Supa s)
    {
        s.afisareDescriere();
    }
    public static void main(String[] args)
    {
        FabricaSupa factory=new FabricaSupa();

        Supa supaLegume=factory.creareSupa(SupaType.LEGUME, 20, 35);
        Supa supaVita=factory.creareSupa(SupaType.VITA, 35, 45);
        Supa supaCiuperci=factory.creareSupa(SupaType.CIUPERCI, 30, 40);

        afisareSupa(supaCiuperci);
        afisareSupa(supaVita);
        afisareSupa(supaLegume);
    }
}
