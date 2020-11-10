package Distributeur1;

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
        System.out.println(String.format("La caisse = %d", a.somme()));
    }

    @Override
    public void askCoffee(Distributeur a) {
        System.out.println("Le café");
        a.reinitialisation();
        a.setState(DistributeurInvalide.getInstance());
    }

    @Override
    public void askTee(Distributeur a) {
        System.out.println("Voici un thé");
        a.reinitialisation();
        a.setState(DistributeurInvalide.getInstance());

    }
}
