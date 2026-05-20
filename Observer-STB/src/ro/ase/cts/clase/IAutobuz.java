package ro.ase.cts.clase;

public interface IAutobuz {
    void trimiteNotificare(String mesaj);
    void addCalator(ICalator c);
    void removeCalator(ICalator c);
}
