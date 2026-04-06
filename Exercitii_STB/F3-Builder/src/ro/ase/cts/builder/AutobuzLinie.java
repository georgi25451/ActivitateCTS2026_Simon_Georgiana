package ro.ase.cts.builder;

public class AutobuzLinie {
    private String model;
    private String numeSofer;
    private boolean oprireCapat;
    private boolean deschidereUsiAutomate;
    private String textDerulator;

    public AutobuzLinie(String model, String numeSofer, boolean oprireCapat, boolean deschidereUsiAutomate, String textDerulator) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.oprireCapat = oprireCapat;
        this.deschidereUsiAutomate = deschidereUsiAutomate;
        this.textDerulator = textDerulator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public boolean isOprireCapat() {
        return oprireCapat;
    }

    public void setOprireCapat(boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
    }

    public boolean isDeschidereUsiAutomate() {
        return deschidereUsiAutomate;
    }

    public void setDeschidereUsiAutomate(boolean deschidereUsiAutomate) {
        this.deschidereUsiAutomate = deschidereUsiAutomate;
    }

    public String getTextDerulator() {
        return textDerulator;
    }

    public void setTextDerulator(String textDerulator) {
        this.textDerulator = textDerulator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", oprireCapat=").append(oprireCapat);
        sb.append(", deschidereUsiAutomate=").append(deschidereUsiAutomate);
        sb.append(", textDerulator='").append(textDerulator).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
