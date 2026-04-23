package ro.ase.cts.main;

import ro.ase.cts.adapter.spital.Medicament;
import ro.ase.cts.adapter.spital.MedicamentAdapter;


public class Main {
    private static void procuraMedicament(ro.ase.cts.adapter.farmacie.Medicament med)
    {
        med.cumparaMedicament();
    }
    public static void main(String[] args) {
        Medicament mSpital=new Medicament("nurofen-reteta", 25);
        ro.ase.cts.adapter.farmacie.Medicament medFarma= new ro.ase.cts.adapter.farmacie.Medicament("algocalmin");

        mSpital.achizitioneazaMedicament();
        medFarma.cumparaMedicament();

        procuraMedicament(medFarma);
        //procuraMedicament(mSpital);

        MedicamentAdapter medAdapt=new MedicamentAdapter(mSpital);
        procuraMedicament(medAdapt);
    }
}
