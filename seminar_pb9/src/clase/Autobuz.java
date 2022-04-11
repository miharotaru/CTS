package clase;

public class Autobuz implements AutobuzLinie{
    private String model;
    private Integer an;
    private Integer nrLocuri;

    public Autobuz(String model, Integer an, Integer nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriere(Linie linie) {
        System.out.println("Linie");
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
