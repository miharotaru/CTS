package state.clase;

public class MementoAutobuz {
    String numeSofer;
    float consumMediu;

    public MementoAutobuz(String numeSofer, float consumMediu) {
        super();
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }
}
