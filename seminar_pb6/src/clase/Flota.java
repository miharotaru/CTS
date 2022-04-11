package clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements IItem{
    private String nume;
    private List<IItem> items;

    public Flota(String nume) {
        this.nume = nume;
        items= new ArrayList<>();
    }

    @Override
    public void adaugareItem(IItem iItem) throws Exception {
        items.add(iItem);
    }

    @Override
    public void stergereItems(IItem iItem) throws Exception {
        items.remove(iItem);
    }

    @Override
    public void descriereItems() throws Exception {
        System.out.println(nume); //afisare pt nodu curent
        for (IItem item: items){
            item.descriereItems(); //afisare copil
        }
    }

    @Override
    public IItem getItems(int pozitie) throws Exception {
        return items.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        float suma=0;
        for (IItem item: items){
            suma+=item.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }
}
