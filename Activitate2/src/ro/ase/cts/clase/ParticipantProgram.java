package ro.ase.cts.clase;

public abstract class ParticipantProgram {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrActivitati;
    protected String[] activitati;

    public String[] getActivitati() {
        return activitati;
    }

    public void setActivitati(String[] activitati) {
        this.activitati = activitati;
    }

    public ParticipantProgram() {
        super();
    }

    public ParticipantProgram(String nume, String prenume, int varsta, int punctaj, int nrActivitati, String[] activitati) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrActivitati = nrActivitati;
        this.activitati = activitati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public int getNrActivitati() {
        return nrActivitati;
    }

    public void setNrActivitati(int nrActivitati) {
        this.nrActivitati = nrActivitati;
    }

    //am impartit metoda in 2 doarece face doua lucruri in unul: compara si afiseaza si am folosit operatorul ternar pt ca era incalcat principiul DRY
    public boolean esteAcceptat()
    {
        return this.punctaj>80;
    }

    public String getMesajStatus()
    {
        return "Participantul "+this.nume+" "+this.prenume+ (esteAcceptat()? " ": " nu ")+"a fost acceptat in program";
    }


}
