package factorymethod.programs;

import factorymethod.*;

public class main {

    private static void afisareMijlocTransport(FactoryMijlocTransport fabrica, int nrInmatriculare){
        MijlocTransport mijlocTransport= fabrica.getMijlocTransport(nrInmatriculare);
        System.out.println(mijlocTransport.toString());
    }

    public static void main(String[] args){
//        MijlocTransport autobuz= new FactoryAutobuz().getMijlocTransport(10);
//        MijlocTransport tramvai= new FactoryTramvai().getMijlocTransport(11);
//        MijlocTransport troleibuz= new FactoryTroleibuz().getMijlocTransport(10);
//
//        System.out.println(autobuz.toString());
//        System.out.println(tramvai.toString());
//        System.out.println(troleibuz.toString());

        afisareMijlocTransport(new FactoryAutobuz(), 100);
        afisareMijlocTransport(new FactoryTramvai(),101);
    }
}
