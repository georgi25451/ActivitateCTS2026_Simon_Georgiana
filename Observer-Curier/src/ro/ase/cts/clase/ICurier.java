package ro.ase.cts.clase;

public interface ICurier {
    void trimiteMesaj(String mesaj);
    void addClient(IClient c);
    void removeClient(IClient c);
}
