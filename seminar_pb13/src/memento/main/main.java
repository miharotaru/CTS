package state.main;

import state.clase.Autobuz;
import state.clase.ManagerAutobuz;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz= new Autobuz("Vasile", 123,"model1", 23);
        ManagerAutobuz managerAutobuz= new ManagerAutobuz();

        managerAutobuz.adaugareMemento(autobuz.creareMemento());
        autobuz.setNumeSofer("popescu");
        managerAutobuz.adaugareMemento(autobuz.creareMemento());

        autobuz.setConsumMediu(15);
        managerAutobuz.adaugareMemento(autobuz.creareMemento());

        System.out.println(autobuz.toString());

        autobuz.revenireStareAnterioara(managerAutobuz.getMementoAutobuz(0));
        System.out.println(autobuz.toString());

    }
}
