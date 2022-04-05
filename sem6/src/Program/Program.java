package Program;

import factory.Factory;
import factory.MijlocTransport;
import factory.TipTrasport;

public class Program {


    public static void main(String[] arg){
        Factory fabrica= new Factory();
        MijlocTransport autobuz=fabrica.getMijlocTransport(TipTrasport.AUTOBUZ,1);
        MijlocTransport troleibuz=fabrica.getMijlocTransport(TipTrasport.TROLEIBUZ, 2);
        MijlocTransport tramvai=fabrica.getMijlocTransport(TipTrasport.TRAMVAI, 3);

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());
    }
}
