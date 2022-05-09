package state.clase;

public class LaCapatDeLinie implements State{
    @Override
    public void doAction(Autobuz autobuz) {
        if (!(autobuz.getState() instanceof LaCapatDeLinie))
        {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+"  este la capat de linie");
            autobuz.setState(this);
        }
        else System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate ajunge la capat de linie");


    }
}
