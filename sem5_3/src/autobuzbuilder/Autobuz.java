package autobuzbuilder;

public class Autobuz {
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private int oraIncepereProgram;
    private String textRulat;

    public Autobuz(String numeSofer, int nrLinie, boolean pauzaSofer, int oraIncepereProgram, String textRulat) {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
        this.pauzaSofer = pauzaSofer;
        this.oraIncepereProgram = oraIncepereProgram;
        this.textRulat = textRulat;
    }

    public Autobuz() {
        this.numeSofer = "numeSofer";
        this.nrLinie = 0;
        this.pauzaSofer = false;
        this.oraIncepereProgram = 0;
        this.textRulat = "textRulat";
    }



    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrLinie=" + nrLinie +
                ", pauzaSofer=" + pauzaSofer +
                ", oraIncepereProgram=" + oraIncepereProgram +
                ", textRulat='" + textRulat + '\'' +
                '}';
    }
}
