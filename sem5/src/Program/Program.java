package Program;

import Clase.Autobuz;
import Clase.Tramvai;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException{
        Autobuz autobuz  = new Autobuz("sofer");
        Tramvai tramvai= new Tramvai("vatman");

        Autobuz autobuz1=(Autobuz) autobuz.copiaza();
        Tramvai tramvai1=(Tramvai) tramvai.copiaza();

        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());
        System.out.println(tramvai.toString());
        System.out.println(tramvai1.toString());

    }
}
