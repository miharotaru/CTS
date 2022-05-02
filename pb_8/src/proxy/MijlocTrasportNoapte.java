package proxy;

public class MijlocTrasportNoapte implements MijlocTransport{
    private MijlocTransport mijlocTransport;

    public MijlocTrasportNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocTransport.getNrCalatori()>0){
            mijlocTransport.opresteInStatie();
        }else
        {
            System.out.println("nus calatori");
        }
    }

    @Override
    public int getNrCalatori() {
        return  mijlocTransport.getNrCalatori();
    }
}
