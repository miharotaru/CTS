package clase;

public interface IItem {
    void adaugareItem(IItem iItem) throws Exception;
    void stergereItems(IItem iItem) throws Exception;
    void descriereItems() throws Exception;
    IItem getItems(int pozitie) throws Exception;
    float calculeazaSumaGarantata(float pretPerLoc);
}
