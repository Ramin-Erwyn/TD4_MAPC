package Distributeur2;

public class DistributeurValide implements DistributeurState {
    private static DistributeurState instance;
    public static DistributeurState getInstance(){
        if (instance==null){
            instance =new DistributeurValide();

        }
        return instance;
    }
    private DistributeurValide(){}


    @Override
    public void give(Distributeur a, int i) {
        a.ajoutCaisse(i);
        if(a.somme() >= 10) {
            a.setState(DistributeurValide.getInstance());
        }
        System.out.println(String.format("caisse = %d", a.somme()));
    }

    @Override
    public void askCoffee(Distributeur a) {
        System.out.println("pas de café");

    }

    @Override
    public void askTee(Distributeur a) {
        System.out.println("pas de tee");


    }

    @Override
    public int getRefund(Distributeur a) {
        int b = a.somme();
        a.reinitialisation();
        System.out.println(String.format("La caisse = %d", b));

        return b ;}
    }

