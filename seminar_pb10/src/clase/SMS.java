package clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Palta prin sms valorea e de: "+pret);
    }
}
