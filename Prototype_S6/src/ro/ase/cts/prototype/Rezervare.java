package ro.ase.cts.prototype;

public class Rezervare implements IRezervare{

    private String client;
    private int nrPersoane;
    private String data;
    private String nrTel;

    public Rezervare()
    {

    }

    public Rezervare(String nrTel, String data, int nrPersoane, String client) throws Exception
    {
        if(nrTel.length()>9 && nrTel.length()<11)
        {
            this.nrTel=nrTel;
        }else throw new Exception("Numar invalid de telefon!");
        this.data=data;
        if(nrPersoane>0)
        {
            this.nrPersoane=nrPersoane;
        }else throw new Exception("Numar invalid de persoane!");
        if(client.length()>=3)
        {
            this.client=client;
        }else this.client="Client";
    }
    @Override
    public IRezervare copy() {
        Rezervare rezervareNoua=new Rezervare();
        rezervareNoua.client=this.client;
        rezervareNoua.nrPersoane=this.nrPersoane;
        rezervareNoua.data=this.data;
        rezervareNoua.nrTel=this.nrTel;
        return (IRezervare) rezervareNoua;
    }

    //setter pt data
    public void setData(String data) {
       this.data=data;
    }

    //setter pt nr persoane


    public void setNrPersoane(int nrPersoane) throws Exception {
        if(nrPersoane>0)
        {
            this.nrPersoane=nrPersoane;
        }else throw new Exception("Numar invalid de persoane!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("client='").append(client).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
