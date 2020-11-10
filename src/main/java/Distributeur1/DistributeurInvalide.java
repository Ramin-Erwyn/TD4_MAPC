package Distributeur1;

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
        a.ajoutCaisse(i);
        if(a.somme() >= 10) {
            a.setState(DistributeurValide.getInstance());
        }
        System.out.println(String.format("La caisse = %d", a.somme()));
    }

    @Override
    public void askCoffee(Distributeur a) {
        System.out.println("nop");
    }

    @Override
    public void askTee(Distributeur a) {
        System.out.println("nop");
    }
}
