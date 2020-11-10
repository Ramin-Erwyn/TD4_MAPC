package Distributeur2;

public class Refund implements DistributeurState {
    private static Refund instance;

    private Refund() {}

    public static Refund getInstance() {
        if(instance == null) {
            instance = new Refund();
        }
        return instance;
    }

    @Override
    public void give(Distributeur a, int i) {}

    @Override
    public void askCoffee(Distributeur a) {}

    @Override
    public void askTee(Distributeur a) {}

    @Override
    public int getRefund(Distributeur a) {
        int b =a.somme();
        a.reinitialisation();
        System.out.println(String.format("caisse = %d", a.somme()));
        a.setState(DistributeurInvalide.getInstance());
        return b ;
    }
}
