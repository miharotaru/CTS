package adapter_obiecte;

public class ValidatorAutobuz implements Validator{
    @Override
    public void validareAbonament() {
        System.out.println("Am verificat abonament autobuz");
    }

    @Override
    public void v_bilet() {
        System.out.println("Am verificat bilet autobuz");
    }
}
