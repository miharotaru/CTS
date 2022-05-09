package command.clase;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInCursa(int linie){
        System.out.println("Autobuzul "+model+" pleca pe linia"+linie);
    }
}
