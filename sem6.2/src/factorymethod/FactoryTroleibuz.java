package factorymethod;

public class FactoryTroleibuz implements FactoryMijlocTransport{
    @Override
    public Tramvai getMijlocTransport(int nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
