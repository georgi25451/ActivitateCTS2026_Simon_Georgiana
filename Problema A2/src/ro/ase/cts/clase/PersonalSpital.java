package ro.ase.cts.clase;

public abstract class PersonalSpital {
    private String nume;
    private String prenume;
    private float salariu;

    public PersonalSpital(String nume, String prenume, float salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }


    public abstract void afisareDescriere();
}
