package clase;

import FlyweightFactory.FlyweightFactory;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("A1", 1995, 40);
        Autobuz autobuz2=new Autobuz("A2", 1996, 43);
        Autobuz autobuz3=new Autobuz("A3", 1996, 43);
        Autobuz autobuz4=new Autobuz("A4", 1996, 43);

        FlyweightFactory flyweightFactory= new FlyweightFactory();
        Linie linie1 = flyweightFactory.getLinie(168);
        Linie linie2 = flyweightFactory.getLinie(133);


        autobuz1.descriere(flyweightFactory.getLinie(168));
        autobuz2.descriere(linie1);
        autobuz3.descriere(linie2);
        autobuz4.descriere(linie2);
    }
}
