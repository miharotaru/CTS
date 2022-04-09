package clase;

public class Facade {

    public static Autobuz autobuz= Autobuz.getInstance();

    public static void deschideUsi()
    {
        //Autobuz autobuz= Autobuz.getInstance();
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void punePeLiber()
    {
        autobuz.puneLiberUsaFata();
        autobuz.puneLiberUsaMijloc();
        autobuz.puneLiberUsaSpate();
    }
}
