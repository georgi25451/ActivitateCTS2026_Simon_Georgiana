package ro.ase.cts.clase;

public abstract class Handler {
    protected Handler handler;

    public Handler() {
        this.handler = null;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract String recomanda(double distanta);
}
