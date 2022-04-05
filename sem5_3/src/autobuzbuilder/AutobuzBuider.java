package autobuzbuilder;

public class AutobuzBuider implements Builder{

    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private int oraIncepereProgram;
    private String textRulat;

//    public AutobuzBuider() {
//        this.autobuz = new Autobuz("Sofer", 2, true, 7, "Statia finala");
//    }

    @Override
    public Autobuz build() {

        return new Autobuz(this.numeSofer, this.nrLinie, this.pauzaSofer, this.oraIncepereProgram, this.textRulat);
    }

    public AutobuzBuider setNumeSofer (String numeSofer) {
        this.numeSofer=numeSofer;
        return this;
    }

    public AutobuzBuider nrLinie (int nrLinie) {
        this.nrLinie=nrLinie;
        return this;
    }

    public AutobuzBuider pauzaSofer (boolean pauzaSofer) {
        this.pauzaSofer=pauzaSofer;
        return this;
    }

    public AutobuzBuider oraIncepereProgram(int oraIncepereProgram) {

        this.oraIncepereProgram=oraIncepereProgram;


        return this;
    }

    public AutobuzBuider textRulat(String textRulat) {
        this.textRulat=textRulat;

        return this;
    }

    @Override
    public String toString() {
        return "AutobuzBuider{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrLinie=" + nrLinie +
                ", pauzaSofer=" + pauzaSofer +
                ", oraIncepereProgram=" + oraIncepereProgram +
                ", textRulat='" + textRulat + '\'' +
                '}';
    }
}
