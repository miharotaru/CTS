package clase;

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

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

   void setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
    }

     void setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
    }

     void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
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
