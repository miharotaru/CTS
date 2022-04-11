package clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Plata prin card bancar valorea e de: "+pret);
    }
}
