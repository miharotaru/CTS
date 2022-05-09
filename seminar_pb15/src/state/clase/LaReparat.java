package state.clase;

public class LaReparat implements State{
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getState() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+ " este la reparat");
            autobuz.setState(this);
        }else System.out.println("Autobuzul "+autobuz.getNrAutobuz()+ "trebuie sa ajunga la capta de linie");

    }
}
