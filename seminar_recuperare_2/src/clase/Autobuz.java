package clase;

public class Autobuz {

    private static Autobuz autobuz=null;

    private Autobuz() {
    }

    public static Autobuz getInstance(){
        if(autobuz!=null)
        {
            return autobuz;
        } else
        {
            autobuz= new Autobuz();
            return autobuz;
        }
    }

    public void deschideUsaFata(){
        System.out.println("Usa din fata deschisa");
    }
    public void deschideUsaMijloc(){
        System.out.println("Usa din mijloc deschisa");
    }
    public void deschideUsaSpate(){
        System.out.println("Usa din spate deschisa");
    }

    public void puneLiberUsaFata(){
        System.out.println("Usa din fata a fost pusa pe liber");
    }
    public void puneLiberUsaMijloc(){
        System.out.println("Usa din ,ijloc a fost pusa pe liber");
    }
    public void puneLiberUsaSpate(){
        System.out.println("Usa din spate a fost pusa pe liber");
    }
}
