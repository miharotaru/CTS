package Program;

import autobuzbuilder.Autobuz;
import autobuzbuilder.AutobuzBuider;

public class main {
    public static void main(String[] args){
        AutobuzBuider builder = new AutobuzBuider();
        builder.textRulat("La multi ani").oraIncepereProgram(9);

        Autobuz a1= builder.build();

        builder.textRulat("Romania").oraIncepereProgram(6);
        Autobuz a2= builder.build();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
