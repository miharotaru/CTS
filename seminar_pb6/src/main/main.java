package main;

import clase.Autobuz;
import clase.Flota;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz1= new Autobuz("Audi", "A1", 10);
        Autobuz autobuz2= new Autobuz("Mertan", "A1", 7);
        Autobuz autobuz3= new Autobuz("Audi", "A4", 30);
        Autobuz autobuz4= new Autobuz("Audi", "A1", 100);
        Autobuz autobuz5= new Autobuz("Audi", "A6", 10);
        Autobuz autobuz6= new Autobuz("Audi", "A6", 10);

        Flota flota1= new Flota("Flota1");
        Flota flota2= new Flota("Flota2");
        Flota flota3= new Flota("FlotaMARE");
        Flota flotaMare= new Flota("FlotaCompaniei");

        try {

            flota1.adaugareItem(autobuz1);
            flota1.adaugareItem(autobuz2);
            flota2.adaugareItem(autobuz3);
            flota2.adaugareItem(autobuz4);
            flota3.adaugareItem(autobuz5);
            flota3.adaugareItem(autobuz6);

            flotaMare.adaugareItem(flota1);
            flotaMare.adaugareItem(flota2);
            flotaMare.adaugareItem(flota3);

            flotaMare.descriereItems();
            flotaMare.stergereItems(flota2);

            flotaMare.stergereItems(autobuz3);

            System.out.println("Suma totala garantata="+flotaMare.calculeazaSumaGarantata(3)+"lei(");
            System.out.println("Suma totala garantata flota3="+flota3.calculeazaSumaGarantata(3));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
