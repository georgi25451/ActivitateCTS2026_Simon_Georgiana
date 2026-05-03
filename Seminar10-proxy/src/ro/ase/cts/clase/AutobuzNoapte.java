package ro.ase.cts.clase;

public class AutobuzNoapte  implements MijlocTransport{
    private MijlocTransport mijlocDeTransport;

    public AutobuzNoapte(MijlocTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocDeTransport.getNrCalatori()>0){
            mijlocDeTransport.opresteInStatie();
        }else {
            System.out.println("Nu opreste in statie!!!");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocDeTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocDeTransport.getLinie();
    }
}
