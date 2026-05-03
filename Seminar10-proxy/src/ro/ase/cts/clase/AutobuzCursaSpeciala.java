package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocTransport{
    private MijlocTransport autobuz;

    public AutobuzCursaSpeciala(MijlocTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getLinie().toLowerCase().contains("speciala")){
            System.out.println("Cursa speciala, autobuzul nu opreste!!!");
        }else {
            autobuz.opresteInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return autobuz.getLinie();
    }
}
