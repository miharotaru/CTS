package factorymethod;

public class FactoryAutobuz implements FactoryMijlocTransport{

    @Override
    public Tramvai getMijlocTransport(int nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
