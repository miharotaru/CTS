package program;

import clase.SMS;
import clase.Validator;

public class main {
    public static void main(String[] args) {
        Validator validator= new Validator(3);
        validator.validareCalatorie();

        //se schimba modul de plata
        //schimbarea strategiei la rulare
        validator.setModPlata(new SMS());
        validator.validareCalatorie();
    }
}
