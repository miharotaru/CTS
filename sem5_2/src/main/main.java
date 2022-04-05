package main;

import clase.Autobuz;
import clase.AutobuzBuider;

public class main {
    public static void main(String[] args){
        AutobuzBuider autobuz= new AutobuzBuider();
        autobuz.setNumeSofer("Dorel").pauzaSofer(false);

        Autobuz autobuz2 = new AutobuzBuider().setNumeSofer("Bobita").nrLinie(3).build();
        System.out.println(autobuz.toString());
        System.out.println(autobuz2.toString());

        AutobuzBuider builder= new AutobuzBuider();
        builder.textRulat("La multi ani").oraIncepereProgram(9);

        Autobuz a1=builder.build();
        Autobuz a2= builder.build();



    }
}
