package main;

import proxy.Autobuz;
import proxy.MijlocTransport;
import proxy.MijlocTrasportNoapte;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz= new Autobuz("b123", 12);
        Autobuz autobuz1= new Autobuz("b112",0);


        MijlocTrasportNoapte mijlocTrasportNoapte= new MijlocTrasportNoapte(autobuz);
        MijlocTrasportNoapte mijlocTrasportNoapte1= new MijlocTrasportNoapte(autobuz1);

        autobuz1.opresteInStatie();
        autobuz.opresteInStatie();
        mijlocTrasportNoapte.opresteInStatie();
        mijlocTrasportNoapte1.opresteInStatie();

    }
}
