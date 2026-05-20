package ro.ase.cts.clase;

public class Student {
    private String nume;
    private boolean areTaxePlatite;

    public Student(String nume, boolean areTaxePlatite) {
        this.nume = nume;
        this.areTaxePlatite = areTaxePlatite;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreTaxePlatite() {
        return areTaxePlatite;
    }
}
