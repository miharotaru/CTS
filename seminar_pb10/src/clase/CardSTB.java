package clase;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("A fost plata stb card valorea e de: "+pret);
    }
}
