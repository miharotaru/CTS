package command.main;


import command.clase.Autobuz;
import command.clase.Comanda;
import command.clase.ManagerComenzi;
import command.clase.PleacaInCursa;

public class Main
{
    public static void main(String[] args) {

        Autobuz autobuz1= new Autobuz("Autobuz1");
        Autobuz autobuz2= new Autobuz("Autobuz2");
        Autobuz autobuz3= new Autobuz("Autobuz3");

        Comanda c1=new PleacaInCursa(autobuz1,331);
        ManagerComenzi mc= new ManagerComenzi();

        mc.invoca(new PleacaInCursa(autobuz1, 331));
        mc.invoca(new PleacaInCursa(autobuz2, 341));
        mc.invoca(new PleacaInCursa(autobuz3, 351));
        mc.invoca(new PleacaInCursa(autobuz1, 401));
        mc.invoca(new PleacaInCursa(autobuz2, 452));
        mc.invoca(new PleacaInCursa(autobuz3, 435));

        mc.executa();
        mc.executa();
        mc.executa();
        mc.executa();






    }
}
