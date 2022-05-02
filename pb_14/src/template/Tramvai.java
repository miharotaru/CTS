package template;

public class Tramvai extends MijlocTransortPeSine{
    @Override
    protected void opresteInStatie1() {
        System.out.println("Oprire staatie 1");
    }

    @Override
    protected void opresteInStatie2() {
        System.out.println("Oprire staatie 2");
    }

    @Override
    protected void opresteInStatie3() {
        System.out.println("Oprire staatie 3");
    }
}
