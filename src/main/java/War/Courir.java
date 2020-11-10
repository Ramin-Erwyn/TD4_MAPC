package War;

public class Courir implements DeplacementStrategie{
    private static DeplacementStrategie instance = new Courir();

    private Courir() {}

    public static DeplacementStrategie getInstance() {
        if(instance == null) {
            instance = new Courir();
        }
        return instance;
    }

    @Override
    public void deplacer() {
        System.out.println("on cour");
    }
}
