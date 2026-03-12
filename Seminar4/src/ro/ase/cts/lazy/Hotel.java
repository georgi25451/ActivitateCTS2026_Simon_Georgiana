package ro.ase.cts.lazy;

public class Hotel {
    private String denumire;
    private int nrCamere;
    private int nrCamereInchiriate;
    private int nrAngajati;

    public void afisareInchiriereHotel()
    {
        if(this.nrCamere==this.nrCamereInchiriate)
        {
            System.out.println("Nu mai puteti inchiria camere!");
        }else {
            System.out.println("Camera a fost inchiriata cu succes");
            this.nrCamereInchiriate++;
        }

    }



    public void afisareInfoHotel()
    {
        final StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrCamere=").append(nrCamere);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrCamereInchiriate=").append(nrCamereInchiriate);
        sb.append('}');
        System.out.println(sb.toString());
    }

    private static Hotel instanta=null;

    private Hotel(String denumire, int nrCamere, int nrAngajati) {
        this.denumire = denumire;
        this.nrCamere = nrCamere;
        this.nrAngajati = nrAngajati;
        this.nrCamereInchiriate=0;
    }


    public static synchronized Hotel getInstance(String denumire, int nrCamere, int nrAngajati)
    {
        //asta e lazy, synchronized=thread
        if(instanta==null)
        {
            instanta=new Hotel(denumire, nrCamere, nrAngajati);
        }

        return instanta;

    }


}
