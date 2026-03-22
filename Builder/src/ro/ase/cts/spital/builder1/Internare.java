package ro.ase.cts.spital.builder1;

public class Internare {

    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDeJun;
    private boolean arePapuciCamera;
    private boolean areHalat;
    public Internare(){
        this.arePatRabatabil = false;
        this.areHalat = false;
        this.arePapuciCamera = false;
        this.areMicDeJun = false;
        this.nume = "";
    }

    public Internare(String nume, boolean arePatRabatabil, boolean areMicDeJun, boolean arePapuciCamera, boolean areHalat) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDeJun = areHalat;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalat = areHalat;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDeJun(boolean areMicDeJun) {
        this.areMicDeJun = areMicDeJun;
    }

    public void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

   //tostring-builder

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDeJun=").append(areMicDeJun);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalat=").append(areHalat);
        sb.append('}');
        return sb.toString();
    }
}
