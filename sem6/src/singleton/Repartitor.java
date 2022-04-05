package singleton;
//clasa def este publica
//dezavantaje: apelul constructorului
//atrib statice sunt intializate la inceput, at cand clasa este referita(atunci cand pro da de clasa)
//
//1lazy initalisasions// syncron ca sa nu apelam de 2 ori constructorul
public class Repartitor {

    private static Repartitor repartitor= null;

    private Repartitor() {
    }

    //1
    public static synchronized Repartitor getInstance(){
        if(repartitor==null){

        repartitor= new Repartitor();
        }
        return repartitor;
    }

}
