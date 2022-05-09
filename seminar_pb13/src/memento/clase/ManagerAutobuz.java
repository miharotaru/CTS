package state.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    private List<MementoAutobuz> listaElemente= new ArrayList<>();

//    public ManagerAutobuz(List<MementoAutobuz> listaElemente) {
//        this.listaElemente = listaElemente;
//    }

    public void adaugareMemento(MementoAutobuz mementoAutobuz){
        listaElemente.add(mementoAutobuz);
    }

    public MementoAutobuz getMementoAutobuz(int index){
        return listaElemente.get(index);
    }

//    public MementoAutobuz getLastMemento() throws Exception
//    {
//            if(listaElemente.size()!=0)
//            {
//                MementoAutobuz memento= listaElemente.get(listaElemente.size()-1);
//                listaElemente.remove(listaElemente.size()-1);
//                return memento;
//            }else {throw  new Exception("NU SE POATE");}
//
//
//
//    }
}
