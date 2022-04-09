package main;

import adapter_obiecte.Validator;
import adapter_obiecte.ValidatorAutobuz;
import adapter_obiecte.ValidatorSubteranAdapter;
import metrou.ValidatorMetrou;
import validator_clase.AdapterMetrouClase;

public class main {

    public static void valideazaBilet(Validator validator){
        validator.v_bilet();
    }

    public static void valideazaAbonament(Validator validator){
        validator.validareAbonament();
    }

    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz= new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
        ValidatorMetrou validatorMetrou= new ValidatorMetrou();
       // valideazaBilet(validatorMetrou);
        ValidatorSubteranAdapter adapter=new ValidatorSubteranAdapter(validatorMetrou);
        valideazaBilet(adapter);
        valideazaAbonament(adapter);

        AdapterMetrouClase adapterMetrouClase= new AdapterMetrouClase();
        valideazaAbonament(adapterMetrouClase);
    }
}
