package clase;

public class AutobuzBuider implements Builder{

    private Autobuz autobuz;

    public AutobuzBuider() {
        this.autobuz = new Autobuz("Sofer", 2, true, 7, "Statia finala");
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuider setNumeSofer (String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuider nrLinie (int nrLinie) {
        this.autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuider pauzaSofer (boolean pauzaSofer) {
        this.autobuz.setPauzaSofer(pauzaSofer);
        return this;
    }

    public AutobuzBuider oraIncepereProgram(int oraIncepereProgram) {

        this.autobuz.setOraIncepereProgram(oraIncepereProgram);


        return this;
    }

    public AutobuzBuider textRulat(String textRulat) {
        this.autobuz.setTextRulat(textRulat);

        return this;
    }

    @Override
    public String toString() {
        return "AutobuzBuider{" +
                "autobuz=" + autobuz +
                '}';
    }
}
