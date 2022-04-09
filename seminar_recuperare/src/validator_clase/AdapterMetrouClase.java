package validator_clase;

import adapter_obiecte.Validator;
import metrou.ValidatorMetrou;

public class AdapterMetrouClase extends ValidatorMetrou implements Validator {

    @Override
    public void v_bilet() {
        super.validareCalatorie();
    }

}
