package state.clase;

public class InCursa implements State{
    @Override
    public void doAction(Autobuz autobuz) {
        if (autobuz.getState() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+"  este in cursa");
            autobuz.setState(this);
        }else System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" trebuie sa ajunga la capat de linie");


    }
}
