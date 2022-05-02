package template;

public abstract class MijlocTransortPeSine {
    protected abstract void opresteInStatie1();
    protected abstract void opresteInStatie2();
    protected abstract void opresteInStatie3();

    public final void parcurgereTraseuInSensNormal(){
        opresteInStatie1();
        opresteInStatie2();
        opresteInStatie3();
    }

    public final void parcurgereTraseuInSensInvers(){
        opresteInStatie3();
        opresteInStatie2();
        opresteInStatie1();
    }
}
