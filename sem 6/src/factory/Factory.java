package factory;

//familie de case== factory
//daca spune sa nu se foloseasaca enum- fac metod

public class Factory {
    public MijlocTransport getMijlocTransport(TipTrasport tipTrasport, int nrInmatriculare){
        if(tipTrasport==TipTrasport.AUTOBUZ){

        }
        switch (tipTrasport){
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
