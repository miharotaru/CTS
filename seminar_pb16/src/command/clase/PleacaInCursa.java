package command.clase;



public class PleacaInCursa implements Comanda {
    private Autobuz autobuz;
    private int nrLinie;

    public PleacaInCursa(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void Executa() {
        autobuz.pleacaInCursa(nrLinie);
    }
}
