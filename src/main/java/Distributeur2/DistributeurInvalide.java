package Distributeur2;

public class DistributeurInvalide implements DistributeurState {
    private static DistributeurState instance;
    public static DistributeurState instance(){
        if (instance==null){
            instance =new DistributeurInvalide();

        }
        return instance;
    }
    private DistributeurInvalide(){

    }

    public static DistributeurState getInstance() {
        if(instance == null) {
            instance = new DistributeurInvalide();
        }
        return instance;
    }



    @Override
    public void give(Distributeur a, int i) {
        System.out.println(String.format("La caisse = %d", a.somme()));
    }

    @Override
    public void askCoffee(Distributeur a) {
        System.out.println("Voici un café");
        a.diminuerCaisse();
        a.setState(Refund.getInstance());

    }

    @Override
    public void askTee(Distributeur a) {
        System.out.println("Le thé");
        a.diminuerCaisse();
        a.setState(Refund.getInstance());

    }

    @Override
    public int getRefund(Distributeur a) {
        int b= a.somme();
        a.reinitialisation();
        a.setState(DistributeurInvalide.getInstance());
        System.out.println(String.format("caisse = %d", b));

        return b ;
    }
}

