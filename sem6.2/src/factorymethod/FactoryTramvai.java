package factorymethod;

public class FactoryTramvai implements FactoryMijlocTransport{
    @Override
    public Tramvai getMijlocTransport(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
