package state.clase;

public class Autobuz {
    private int nrAutobuz;
    private State state;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.state= new LaCapatDeLinie();
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }


    public State getState() {
        return state;
    }

    protected void setState(State state) {
        this.state = state;
    }

    public void pleacaInCursa(){
        new InCursa().doAction(this);
    }

    public  void ajungeLaCapatLinie()
    {
        new LaCapatDeLinie().doAction(this);
    }

    public  void trimiteInService(){
        new LaReparat().doAction(this);
    }
    public void ieseDinService()
    {
        new LaCapatDeLinie().doAction(this);
    }
}
